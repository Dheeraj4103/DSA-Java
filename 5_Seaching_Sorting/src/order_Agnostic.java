import java.util.Arrays;
import java.util.Scanner;

public class order_Agnostic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {-48, -18, 12, 23, 46, 56, 89, 90, 456};
        int target = in.nextInt();
        int [] arr1 = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            arr1[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Order_AgnosticBS(arr, target));

    }
    static int Order_AgnosticBS(int[] arr, int target){
        if (arr.length == 0)
            return -1;
        int st = 0, end = arr.length - 1;
        int mid = 0;
        boolean isAsc = arr[st] < arr[end];
        while (st <= end){
            // (start+end)/2 might exceed range
            mid = st + ((end - st) / 2);
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid]) {
                st = (isAsc ? mid + 1 : st);
                end = (isAsc ? end : mid - 1);
            } else if (target < arr[mid]) {
                end = (isAsc ? mid - 1 : end);
                st = (isAsc ? st : mid + 1);
            }
        }
        return -1;
    }
}
