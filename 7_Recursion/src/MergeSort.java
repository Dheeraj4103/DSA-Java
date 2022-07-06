import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int arr1[] = {3, 8, 10, 14, 20, 25};
//        int arr2[] = {4, 5, 12, 13};
        int arr[] = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(Sort(arr, 0, arr.length-1)));
    }

    static int[] Sort(int[] arr, int st, int end){
        // if only one element left in array return array
        if (st == end)
            return new int[]{arr[st]};
        // calculate mid
        int mid = st + (end - st)/2;
        /* go to the left-hand side of the array */
        int left[] = Sort(arr, st, mid);
    // go to the right-hand side of the array
        int right[] = Sort(arr, mid+1, end);
        // merge two sorted arrays and return
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        // calculate the length of the resultant array
        // i.e length of first and second.
        int n = first.length + second.length;
        // declare resultant array
        int ans[] = new int[n];
        // get two pointers for start of two arrays
        int st1 = 0, st2 = 0;
        // two pointers at end of two arrays
        int end1 = first.length-1, end2 = second.length-1;
        // counter for resultant array
        int i = 0;
        // if any of the array is empty came out of the loop
        while (st1 <= end1 && st2 <= end2){
            // if element of first is less than second
            // add first to resultant and increment first pointer.
            if (first[st1] < second[st2]){
                ans[i] = first[st1];
                st1++;
            }
            // else do the same for second array
            else{
                ans[i] = second[st2];
                st2++;
            }
            // increment pointer for resultant pointer.
            i++;
        }
        // if elements are remaining in first array add them into resultant
        if (st1 <= end1){
            for (int j = st1; j <= end1; j++){
                ans[i] = first[j];
                i++;
            }
        }
        // if elements are remaining in second array add them into resultant
        if (st2 <= end2){
            for (int j = st2; j <= end2; j++){
                ans[i] = second[j];
                i++;
            }
        }
        // return resultant array
        return ans;
    }
}
