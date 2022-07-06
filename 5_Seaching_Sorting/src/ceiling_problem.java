import java.util.Arrays;
import java.util.Scanner;

public class ceiling_problem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int[] arr1 = {-48, -18, 12, 23, 46, 56, 89, 90, 456};
        int target = in.nextInt();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Ceiling(arr1,target));
    }
    static int Ceiling(int[] arr, int target){
        if ((arr.length == 0) || (target > arr[arr.length - 1]))
            return -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            // (start+end)/2 might exceed range
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target)
                return arr[mid];
            else if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
        }
        return arr[start];
    }
}
