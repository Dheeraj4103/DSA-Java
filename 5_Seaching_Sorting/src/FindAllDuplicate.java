import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            // here [m, n] = [1, N]
            int correct = arr[i]-1;
            if (correct < arr.length && arr[correct] != arr[i])
                Swap(arr, i, correct);
            else
                i++;
        }
        for (i = 0; i < arr.length; i++){
            if (i+1 != arr[i])
                ans.add(arr[i]);
        }
        return ans;
    }
    static void Swap(int[] arr, int curr, int target){
        int temp = arr[curr];
        arr[curr] = arr[target];
        arr[target] = temp;
    }
}
