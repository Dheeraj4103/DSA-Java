import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));
        Sort(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i]-1;
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
