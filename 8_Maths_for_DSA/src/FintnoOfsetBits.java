public class FintnoOfsetBits {
    public static void main(String[] args) {
        System.out.println(SetBitCount(10));
    }
    static int SetBitCount(int n){
        int cnt = 0;
        while (n > 0){
            cnt++;
            n = n & (n-1);
        }
        return cnt;
    }
}
