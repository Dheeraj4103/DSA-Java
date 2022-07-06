import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0, -1};
        bubble(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int st, int end){
        if (end == 0)
            return;
        if (st < end){
            if (arr[st] > arr[st+1]){
                int temp = arr[st];
                arr[st] = arr[st+1];
                arr[st+1] = temp;
            }
            bubble(arr, st+1, end);
        }
        else
            bubble(arr, 0, end-1);
    }
}
