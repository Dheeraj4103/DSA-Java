public class FindInMountainArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,3,1};
        int[] arr = {0,1,2,4,2,1};
        System.out.println(Search(arr, 1));
    }
    static int Search(int[] arr, int target){
        int peak = FindMax(arr);
        int first = Order_AgnosticBS(arr, 0, peak, target);
        if (first != -1)
            return first;
        return Order_AgnosticBS(arr, peak+1, arr.length-1, target);
    }
    static int FindMax(int[] arr) {
        int st = 0, end = arr.length-1;
        while (st < end){
            int mid = st+(end-st)/2;
            if (arr[mid] > arr[mid+1])
                end = mid;
            else
                st = mid+1;
        }
        return arr[end];
    }
    static int Order_AgnosticBS(int[] arr, int st, int end, int target){
        if (arr.length == 0)
            return -1;
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
