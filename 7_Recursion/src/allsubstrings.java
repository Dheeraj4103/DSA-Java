import java.util.*;

public class allsubstrings {
    public static void main(String[] args) {
        System.out.println(Substring("", "123456784"));
    }
    static ArrayList<String> Substring(String p, String s){
        ArrayList<String> ans = new ArrayList<>();
        if (s.isEmpty()){
            ans.add(p);
            return ans;
        }
        ans.addAll(Substring(p+s.charAt(0), s.substring(1)));
        ans.addAll(Substring(p, s.substring(1)));
        return ans;
    }
}
