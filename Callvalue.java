public class Callvalue {
    static void change(int m){
        m = m + 5;
        System.out.println(m);
    }
    public static void main(String[] args){
        int n = 7;
        change(n);
        System.out.println(n);
    }
}
