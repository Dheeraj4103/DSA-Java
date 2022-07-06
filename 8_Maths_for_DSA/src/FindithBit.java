public class FindithBit {
    public static void main(String[] args) {
        int num = 5;
        int n = 2;
        int bit = num & (1 << (n-1));
        System.out.println(bit);
    }
}
