public class array {

    public static void main(String[] args) {
        /*
         String[] arr = new String[5];
         System.out.println(arr[0]);
         int[] arr = { 1, 2, 3, 4, 5 };
         for (int x : arr) {
             System.out.print(x + " ");
         }
        */

        int[][] arr = {
                { 1, 2, 3 },
                { 5, 6 },
                {7, 8, 9, 10}
        };

        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
