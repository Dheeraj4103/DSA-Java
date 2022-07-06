public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr) {
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
            if (i+1 != arr[i]){
                return arr[i];
            }
        }
        return arr.length;
    }
    static void Swap(int[] arr, int curr, int target){
        int temp = arr[curr];
        arr[curr] = arr[target];
        arr[target] = temp;
    }
}
