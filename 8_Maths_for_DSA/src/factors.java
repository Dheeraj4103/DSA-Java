import java.util.ArrayList;
import java.util.List;

public class factors {
    public static void main(String[] args) {
        Factor(20);
    }
    static void Factor(int n){
        List<Integer> ans = new ArrayList<>();
        int st = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0){
                ans.add(st++,i);
                ans.add(st,n/i);
            }
        }
        System.out.println(ans);
    }
}
