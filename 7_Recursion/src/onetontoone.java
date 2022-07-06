public class onetontoone {
    public static void main(String[] args) {
        func(5);
    }
    static void func(int n){
        if (n == 0)
            return;
        System.out.print(n + " ");
        func(n-1);
        System.out.print(n + " ");
    }
}
