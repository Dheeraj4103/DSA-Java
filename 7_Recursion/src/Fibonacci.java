public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fib(50));
    }
    static int Fib(int n){
        if (n < 2) {
            return n;
        }
        return Fib(n-1) + Fib(n-2);
    }
}
