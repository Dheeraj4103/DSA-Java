public class H_index {
    public static void main(String[] args) {
        int[] citations = {10};
        System.out.println(hIndex(citations));
    }
    static int hIndex(int[] citations) {

        int min = 0, max = citations[0];
        int st = 0, end = citations.length-1;
        for (int i = st; i <= end; i++){
            min = Math.min(min, citations[i]);
            max = Math.max(max, citations[i]);
        }
        while (min <= max){
            int mid = min+(max-min)/2;
            int cnt = 0;
            for (int i = st; i <= end; i++){
                cnt += (citations[i] >= mid ? 1 : 0);
            }
            if (cnt == mid){
                max = mid;
                break;
            }
            if (cnt > mid){
                min = mid+1;
            }
            else
                max=mid-1;
        }
        return max;
    }
}
