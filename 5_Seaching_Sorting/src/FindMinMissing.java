import java.util.Arrays;

public class FindMinMissing {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));

    }
    static int missingNumber(int[] nums) {
        Sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (i != nums[i])
                return i;
        }
        return nums.length;
    }
    static void Sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (correct == arr.length){
                i++;
                continue;
            }
            if (arr[correct] != arr[i])
                Swap(arr, i, correct);
            else
                i++;
        }
    }
    static void Swap(int[] arr, int curr, int target){
        int temp = arr[curr];
        arr[curr] = arr[target];
        arr[target] = temp;
    }
}
