import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {6, 4, 2, 3, 5, 1};
        Sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr, int low, int high){
        // only one element left in part of array
        if (low >= high){
            return;
        }
        // point st to low and end to high
        int st = low, end = high;
        // calculate mid
        int mid = st + (end - st)/2;
        // get the pivot element
        int pivot = arr[mid];
        // start the while loop
        while (st <= end){
            // increment st if element is smaller than pivot
            while (arr[st] < pivot){
                st++;
            }
            // decrement end if element is greater than pivot
            while (arr[end] > pivot){
                end--;
            }
            // if st <= end swap elements
            // we check this condition again as this condition can be
            // false at this line code.
            if (st <= end) {
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        // go to left-hand side
        Sort(arr, low, end);
        // go to the right-hand side/
        Sort(arr, st, high);
    }
}
