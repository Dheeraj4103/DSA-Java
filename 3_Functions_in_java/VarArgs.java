import java.util.Arrays;

public class VarArgs <T> {
    public static void main(String[] args) {
        func(1, 2, 3, 4, 89, 100);
        multiple(2, 8, "Dheeraj", "Rushikesh", "Omkar", "Raj");
    }
    
    static void multiple(int a, int b, String ...v){
        System.out.println(a + " " + b + Arrays.toString(v));
    }

    static void func(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
