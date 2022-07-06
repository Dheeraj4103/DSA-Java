public class FIndRotationInRSA {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 15};
        System.out.println(FindPivot(arr)+1);
    }
    static int FindPivot(int[] arr){
        int st = 0;
        int end = arr.length - 1;
        if (end == 0)
            return 0;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid > 0 && arr[mid] < arr[mid-1])
                return mid-1;
            if (mid < arr.length-1 && arr[mid] > arr[mid+1])
                return mid;
            if (arr[mid] <= arr[st])
                end = mid-1;
            else
                st = mid+1;
        }
        return -1;
    }
}
