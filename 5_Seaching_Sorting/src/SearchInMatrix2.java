import java.util.Arrays;

public class SearchInMatrix2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(Search(matrix, 7)));
    }
    static int[] Search(int[][] matrix, int target){
        int cnt = 0;
        // check in every row
        for (int[] arr : matrix){
            // if target is in the row, do binary search
            if (target >= arr[0] && target <= arr[arr.length-1]){
                // do binary search
                int first = Binary_Search(arr, target);
                // if target is found in the row
                // return row and col
                if (first != -1)
                    return new int[]{cnt, first};
                // if not found return {-1, -1}
                // as target will not found in below rows
                return new int[] {-1, -1};
            }
            // else go to the next row
            cnt++;
        }
        return new int[]{-1, -1};
    }
    static int Binary_Search(int[] arr, int target){
        int st = 0, end = arr.length-1;
        while (st <= end){
            int mid = st+(end-st)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (target > arr[mid])
                st = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
