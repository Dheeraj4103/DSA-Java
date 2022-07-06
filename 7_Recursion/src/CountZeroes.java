public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(Count(3021004, 0));
    }
    static int Count(int n, int cnt){
        if (n == 0)
            return cnt;
        cnt += (n%10 == 0 ? 1 : 0);
        return Count(n/10, cnt);
    }
}
