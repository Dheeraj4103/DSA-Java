import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        int[] arr = nums;
        System.out.println(Arrays.toString(arr));
        nums[0] = 10;
        System.out.println(Arrays.toString(arr));
        arr[3] = 20;
        System.out.println(Arrays.toString(nums));
//        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (correct < nums.length && correct >= 0){
                if (nums[correct] != nums[i])
                    Swap(nums, i, correct);
                else
                    i++;
            }
            else{
                i++;
            }

        }
        for (i = 0; i < nums.length; i++){
            if (i+1 != nums[i])
                return i+1;
        }
        return 1;
    }
    static void Swap(int[] arr, int curr, int target){
        int temp = arr[curr];
        arr[curr] = arr[target];
        arr[target] = temp;
    }
}
