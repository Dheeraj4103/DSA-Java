public class EvenOdd {
    public static void main(String[] args) {
        int n = 61;
        System.out.println(isOdd(n));
        System.out.println(isOdd(66));
    }
    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
