public class output {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {1, 3}
        };
        int k = 1;
        int row = (k-1) / matrix.length;
        int col = k - (row* matrix.length)-1;
        System.out.println(row + " " + col);

    }
}
