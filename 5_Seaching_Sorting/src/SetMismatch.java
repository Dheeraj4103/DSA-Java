import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        int[] ans = new int[2];
        while (i < arr.length){
            // here [m, n] = [1, N]
            if (i+1 != arr[i]) {
                int correct = arr[i] - 1;
                if (correct < arr.length && arr[correct] != arr[i])
                    Swap(arr, i, correct);
                else{
                    ans[0] = arr[i];
                    ans[1] = i+1;
                    return ans;
                }
            }
            else
                i++;
        }
        return ans;
    }
    static void Swap(int[] arr, int curr, int target){
        int temp = arr[curr];
        arr[curr] = arr[target];
        arr[target] = temp;
    }
}
