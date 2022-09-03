public class newsearch {
    public static void main(String[] args) {
        int[] arr = {99,43,33,22,15,12,11,7,6,3,2,1};
        int target = 12;
        int ans = orderagnostic(arr,target);
        System.out.println(ans);
    }
    static int orderagnostic(int[] arr,int target){
        if (arr[0]<arr[arr.length-1]){
            return BS(arr,target) ;
        }
        return BS1(arr,target);
    }
    static int BS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target>arr[mid]){
                start = mid + 1;
            }
            if (target<arr[mid]){
                end = mid - 1;
            }
            if (target==arr[mid]){
                return mid;
            }
        }
        return -1;
    }

    static int BS1(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                end = mid - 1;
            }
            if (target<arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
