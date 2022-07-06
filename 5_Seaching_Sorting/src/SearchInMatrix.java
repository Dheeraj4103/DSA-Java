import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 37, 39, 49},
                {33, 38, 44, 50}
        };
        int[] ans = Search(arr, 37);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr, int target){
        // In this method we are checking last element of
        // every row with target
        int row = 0, col = arr[0].length-1;
        while (row < arr.length && col >= 0){
            // if last element is equal to target
            // return row and col
            if (arr[row][col] == target){
                return new int[]{row, col};
            }
            // if last element is less than target
            // go to the next row as target will not be found in current row
            if (arr[row][col] < target){
                row++;
            }
            // if last element is greater than target
            // go to the previous col as target will not be found in current col
            else{
                col--;
            }
        }
        // if target not found return {-1, -1}
        return new int[] {-1, -1};
    }
}
