public class infinitearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 18, 20};
        System.out.println(FindInInfiniteArray(arr, 8));
    }
    static int FindInInfiniteArray(int[] arr, int target){
        int st = 0, end = 1;
        // Finding the range for binary search
        while (target > arr[end]){
            int temp = end+1;
            // changing st and end
            // end = end + (previous size of box)*2;
            end += (end-st+1)*2;
            st = temp;
        }
        // after getting the range for binary search
        // call the Binary_Search function
        return Binary_Search(arr, st, end,target);
    }
    static int Binary_Search(int[] arr, int st, int end, int target){
        while (st <= end){
            int mid = st + (end-st)/2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                st = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
