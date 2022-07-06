public class rotated_sorted_array {
    public static void main(String[] args) {
//        int[] nums = { 4,5,6,7,0,1,2};
        int[] nums = {1, 2};
        System.out.println(FindMin(nums));
    }
    static int FindMin(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        // if first element is greater than last element array is not rotated

        while (st < end) {
            int mid = st + (end - st) / 2;
            if (nums[end] > nums[st])
                return nums[st];
            // if mid is less than start then min will lie on left side of mid
            // hence we don't know mid is min or not so end = mid;
            if (nums[mid] < nums[st])
                end = mid;
            // if mid greater than start then min will lie on right side of mid
            // hence there can be element greater than mid or min element itself on right side of mid
           //  st = mid+1
            else if (nums[mid] > nums[st])
                st = mid + 1;
            // in below condition only two element are left
            // return the minimum of them
            else {
                if (nums[st] > nums[end])
                    return nums[end];
                return nums[st];
            }
        }
        return -1;
    }
}
