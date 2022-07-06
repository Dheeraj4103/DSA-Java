public class ResetBit {
    public static void main(String[] args) {
        int num = 5;
        int n = 1;
        int temp = ((1 << (n-1))^1);
        int bit = num & temp;
        System.out.println(bit);
    }
}
