public class Needforover {
    static class SearchUtil {

        public int search(int a[], int ele) {
            return search(a, ele, 0);
        }

        public int search(int a[], int ele, int pos) {
            if (pos < 0 || pos >= a.length) {
                return -1;
            }

            for (int i = pos; i < a.length; i++) {
                if (a[i] == ele) {
                    return i;
                }
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int ele = 30;

        SearchUtil obj = new SearchUtil();

        int x = obj.search(arr, ele);

        int y = obj.search(arr, ele, 3);

        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}

