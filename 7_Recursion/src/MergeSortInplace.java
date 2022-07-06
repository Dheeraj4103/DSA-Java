import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 3, 2, 1};
        SortInplace(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void SortInplace(int[] arr, int st, int end){
        // if only one element left in array return array
        if ((end - st + 1) == 1)
            return;
        // calculate mid
        int mid = st + (end - st)/2;
        /* go to the left-hand side of the array */
        SortInplace(arr, st, mid);
        // go to the right-hand side of the array
        SortInplace(arr, mid+1, end);
        // merge two sorted arrays and return
        mergeInPlace(arr, st, mid, end);
    }

    static void mergeInPlace(int[] arr, int st, int mid, int end){
        // calculate the length of the resultant array
        // i.e length of first and second.
        int n = end - st + 1;
        // declare resultant array
        int ans[] = new int[n];
        // get two pointers for start of two arrays
        int st1 = st, st2 = mid+1;
        // two pointers at end of two arrays
        int end1 = mid, end2 = end;
        // counter for resultant array
        int i = 0;
        // if any of the array is empty came out of the loop
        while (st1 <= end1 && st2 <= end2){
            // if element of first is less than second
            // add first to resultant and increment first pointer.
            if (arr[st1] < arr[st2]){
                ans[i] = arr[st1];
                st1++;
            }
            // else do the same for second array
            else{
                ans[i] = arr[st2];
                st2++;
            }
            // increment pointer for resultant pointer.
            i++;
        }
        // if elements are remaining in first array add them into resultant
        if (st1 <= end1){
            for (int j = st1; j <= end1; j++){
                ans[i] = arr[j];
                i++;
            }
        }
        // if elements are remaining in second array add them into resultant
        if (st2 <= end2){
            for (int j = st2; j <= end2; j++){
                ans[i] = arr[j];
                i++;
            }
        }
        // return resultant array
        for (int k = 0; k < n; k++){
            arr[st+k] = ans[k];
        }
    }
}
