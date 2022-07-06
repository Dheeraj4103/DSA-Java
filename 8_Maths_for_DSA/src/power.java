public class power {
    // Calculate a power b
    public static void main(String[] args) {
        System.out.println(Power(2, 31));
    }
    static long Power(long base, long power){
        long ans = 1;
        while (power > 0){
            if ((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        return ans;
    }
}
