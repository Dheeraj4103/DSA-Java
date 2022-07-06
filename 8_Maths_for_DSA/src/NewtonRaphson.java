public class NewtonRaphson {
    public static void main(String[] args) {
        System.out.println(NRM(40));
    }
    static double NRM(double n){
        double ans = n;
        double root;
        while (true){
            root = (ans + (n/ans))*0.5;
            if (Math.abs(root-ans) < 0.5)
                break;
            ans = root;
        }
        return root;
    }
}
