import java.util.Arrays;

public class DheerajSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 3, 5};
        Sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr, int curr, int target){
        int temp = arr[target];
        arr[target] = arr[curr];
        arr[curr] = temp;
    }
    static void Sort(int[] arr, int st, int end){
            int mnidx = st, mxidx = st;
            int min = arr[st], max = arr[st];
            if (st >= end)
                return;
            for (int i = st; i <= end; i++){
                if (arr[i] > max){
                    max = arr[i];
                    mxidx = i;
                }
                if (arr[i] < min){
                    min = arr[i];
                    mnidx = i;
                }
            }
            if (mnidx == end)
                mnidx = mxidx;
            Swap(arr, mxidx, end);
            Swap(arr, mnidx, st);
            Sort(arr, st+1, end-1);

    }
}
