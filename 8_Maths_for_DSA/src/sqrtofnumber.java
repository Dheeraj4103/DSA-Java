public class sqrtofnumber {
    public static void main(String[] args) {
        Sqrt(40, 3);
    }
    static void Sqrt(int n, int p){
        int st = 0, end = n;
        double root;
        while (st <= end){
            int mid = st + (end-st)/2;
            if (mid*mid == n){
                end = mid;
                break;
            }
            else if (mid*mid > n){
                end = mid-1;
            }
            else
                st = mid+1;
        }
        root = end;
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root <= n)
                root += inc;
            root -= inc;
            inc /= 10;
        }
        System.out.printf("%.3f",root);
    }
}
