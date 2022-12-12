import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        long fibs[] = new long[101];
        System.out.println(FibwithDP(100, fibs));
        System.out.println(Arrays.toString(fibs));
    }
    static int Fib(int n){
        if (n < 2) {
            return n;
        }
        return Fib(n-1) + Fib(n-2);
    }

    static long FibwithDP(int n, long[] fibs){
        if (n < 2) {
            fibs[n] = n;
            return (long)n;
        }

        if (fibs[n-1] == 0){
            fibs[n-1] = FibwithDP(n-1, fibs);
        }
        if (fibs[n-2] == 0){
            fibs[n-2] = FibwithDP(n-2, fibs);
        }
        fibs[n] = fibs[n-1] + fibs[n-2];
        return fibs[n];
    }
}
