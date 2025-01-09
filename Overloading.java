public class Overloading {
    public static class Sample {
        public void print(int a) {
            System.out.println("int-" + a);
        }

        public void print(double a) {
            System.out.println("Double -" + a);
        }

        public void print(String a) {
            System.out.println("String -" + a);
        }
    }

    public static void main(String[] args) {
        Sample obj = new Sample();

        obj.print(10);
        obj.print(10.2);
        obj.print("ABC");
    }
}
