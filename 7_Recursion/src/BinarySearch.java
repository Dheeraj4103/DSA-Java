public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 56, 63, 78};
        System.out.println(Binary_Search(arr, 0, arr.length-1, 9));
    }
    static int Binary_Search(int[] arr, int st, int end, int target){
        int mid = st + (end - st)/2;
        // Base Condition
        // start is greater than end, target not found
        if (st > end)
            return -1;
        // if target is found return mid
        if (arr[mid] == target)
            return mid;
        // target > mid again call function
        // and put st = mid+1
        if (target > arr[mid])
            return Binary_Search(arr, mid+1, end, target);
        // target < mid again call function
        // and put end = mid-1
        return Binary_Search(arr, st, mid-1, target);
    }
}
