public class splitarray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr, 2));
    }
    static int splitArray(int[] nums, int m){
        int st = 0;
        int end = 0;
        for (int num : nums){
            st = Math.max(num, st);
            end += num;
        }
        while (st < end){
            int mid = st+(end-st)/2;
            int sum = 0;
            int piece = 1;
            for (int num : nums){
                if (sum+num > mid){
                    sum = num;
                    piece++;
                }
                else{
                    sum += num;
                }
            }
            if (piece > m){
                st = mid+1;
            }
            else{
                end = mid;
            }
        }
        return st;
    }
}
