public class Minimum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(Findmin(arr, 0, arr.length-1, 0));
    }
    static int Findmin(int[] arr, int st, int end, int idx){
        int mid = st + (end - st)/2;
        if (st >= end){
            return (arr[mid] < arr[idx] ? mid : idx);
        }
        if (end - st == 1){
            int mnidx = (arr[st] < arr[end] ? st : end);
            return (arr[mnidx] < arr[idx] ? mnidx : idx);
        }
        if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
            int left = Findmin(arr, st, mid-1, idx);
            return Findmin(arr, mid+1, end, left);
        }
        if (arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]){
            int mnidx = (arr[mid] < arr[idx] ? mid : idx);
            int left = Findmin(arr, st, mid-2, mnidx);
            return Findmin(arr, mid+2, end, left);
        }
        if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
            int mnidx = (arr[mid] < arr[idx] ? mid : idx);
            int left = Findmin(arr, st, mid-1, mnidx);
            return Findmin(arr, mid+2, end, left);
        }
        int mnidx = (arr[mid] < arr[idx] ? mid : idx);
        int left = Findmin(arr, st, mid-2, mnidx);
        return Findmin(arr, mid+1, end, left);
    }
}
