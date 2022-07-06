public class rotated_sorted_array2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
//          int[] nums = {10, 1, 10, 10, 10};
//        int[] nums = {2, 2, 2, 0, 1};
//        int[] nums = {3,1,1,1,1};
//        int[] nums = {2,3,0,0};
//        int[] nums = {1,2,3,3,0,0,0};

        System.out.println(search(nums, 2));
    }
    static boolean search(int[] arr, int target) {
        if (FindinRSA(arr, target) != -1)
            return true;
        return false;
    }
    static int FindinRSA(int[] arr, int target){
        int pivot = FindPivot(arr);
        if (pivot == -1) {
            return Binary_Search(arr, 0, arr.length-1, target);
        }
        if (arr[pivot] == target)
            return pivot;
        int first = Binary_Search(arr, 0, pivot-1, target);
        if (first !=  -1)
            return first;
        return Binary_Search(arr, pivot+1, arr.length-1, target);
    }

    static int FindPivot(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid < nums.length-1 && nums[mid] > nums[mid+1])
                return mid;
            if (mid > 0 && nums[mid] < nums[mid-1])
                return mid-1;
            if (nums[end] > nums[st]) {
                return st;

            } else if ((nums[mid] <= nums[st]) && (nums[mid] < nums[end])) {
                end = mid;
            } else if (nums[mid] >= nums[st] && nums[mid] > nums[end]) {
                st = mid+1;
            }
            else if (end-st == 1){
                if (nums[st] > nums[end])
                    return st;
                return end;
            }
//
            else{
                if (st < nums.length-1 && nums[st] > nums[st+1])
                    return st;
                st++;
                if (end > 0 && nums[end] < nums[end-1])
                    return end-1;
                end--;
            }

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