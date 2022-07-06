public class ReverseNUM {
    public static void main(String[] args) {
        System.out.println(Reverse(0, 18223));
    }
    static int Reverse(int rev, int n){
        // get the reversed number and add digit to it
        if (n%10 == n)
            return rev+n;
        rev += n%10;
        return Reverse(rev*10, n/10);
    }
}
