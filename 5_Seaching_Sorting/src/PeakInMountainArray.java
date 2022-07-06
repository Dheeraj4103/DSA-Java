public class PeakInMountainArray {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 5, 6, 4, 0};
        int[] arr = {0,2, 1, 0};
        System.out.println(FindMax(arr));
    }
    static int FindMax(int[] arr){
        int st = 0, end = arr.length-1;
        while (st < end){
            int mid = st+(end-st)/2;
            if (arr[mid] > arr[mid+1])
                end = mid;
            else
                st = mid+1;
        }
        return arr[end];
    }
}
