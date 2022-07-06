import javax.lang.model.type.NullType;
import java.util.Arrays;

public class firstlast {
    public static void main(String[] args) {
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        int[] nums = {-99999,-99998,-9999,-999,-99,-9,-1};
        int[] nums = {1};
        System.out.println(Arrays.toString(searchRange(nums, 1)));
    }
    static int Binary_Search(int[] nums,int target, boolean firstocc){
        int st = 0, end = nums.length - 1;
        int ans = -1;
        while (st <= end){
            int mid = st + ((end-st)/2);
            if (target == nums[mid]){
                ans = mid;
                if (firstocc){
                    end = mid - 1;
                }
                else{
                    st = mid +1;
                }
            }
            else if (target > nums[mid]){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = Binary_Search(nums, target, true);
        ans[1] = Binary_Search(nums, target, false);
        return ans;
    }
}
