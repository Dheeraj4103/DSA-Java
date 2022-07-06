public class XORTillN {
    public static void main(String[] args) {
        System.out.println(XOR(5));
    }
    static int XOR(int n){
        int check = n % 4;
        int ans = 0;
        switch (check){
            case 0 -> {ans = n;}
            case 1 -> {ans = 1;}
            case 2 -> {ans = n+1;}
            case 3 -> {ans = 0;}
        }
        return ans;
    }
}
