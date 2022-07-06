public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(Sumdigit(124));
    }
    static int Sumdigit(int n){
        if (n == 0)
            return 0;
        return (Sumdigit(n/10)+n%10);
    }
}
