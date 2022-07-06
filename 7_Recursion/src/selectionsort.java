import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0};
       selection(arr, 0, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int st, int end, int mxidx){
        if (end == 0)
            return;
        if (st < end){
            mxidx = (arr[st] > arr[mxidx] ? st : mxidx);
            selection(arr, st+1, end, mxidx);
        }
        else{
            mxidx = (arr[st] > arr[mxidx] ? st : mxidx);
            int temp = arr[mxidx];
            arr[mxidx] = arr[end];
            arr[end] = temp;
            selection(arr, 0, end-1, 0);
        }
    }
}
