import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllMissing {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
       Sort(nums);
       for (int i = 0; i < nums.length; i++){
           if (i+1 != nums[i])
               l.add(i+1);
       }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {1,1};

        System.out.println(findDisappearedNumbers(arr));
    }
    static void Sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            // here [m, n] = [1, N]
            int correct = arr[i]-1;
            if (correct < arr.length && arr[correct] != arr[i])
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