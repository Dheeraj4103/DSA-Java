

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-48, -18, 12, 23, 46, 56, 89, 90, 456};
        int target = 23;
        System.out.println(Search(arr, target));
    }
    static int Search(int[] arr, int target){
        if (arr.length == 0)
            return -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            // (start+end)/2 might exceed range
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
        }
        return -1;
    }
}
