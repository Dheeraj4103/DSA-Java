public class SearchInRSA {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//        int[] arr = {3,5};
        System.out.println(FindInRSA(arr, 7));
    }
    static int FindInRSA(int[] arr, int target){
        int pivot = FindPivot(arr);
        if (pivot == -1)
            return Binary_Search(arr, 0, arr.length-1, target);
        if (arr[pivot] == target)
            return pivot;
        if (target >= arr[0])
            return Binary_Search(arr, 0, pivot-1, target);
        return Binary_Search(arr, pivot+1, arr.length-1, target);
    }
    static int FindPivot(int[] arr){
        int st = 0;
        int end = arr.length - 1;
        if (end == 0)
            return 0;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid > 0 && arr[mid] < arr[mid-1])
                return mid-1;
            if (mid < arr.length-1 && arr[mid] > arr[mid+1])
                return mid;
            if (arr[mid] <= arr[st])
                end = mid-1;
            else
                st = mid+1;
        }
        return -1;
    }
    static int Binary_Search(int[] arr, int st, int end, int target){
        while (st <= end){
            // (start+end)/2 might exceed range
            int mid = st + ((end - st) / 2);
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                st = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
        }
        return -1;
    }
}
