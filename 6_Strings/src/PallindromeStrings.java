import java.util.Scanner;

public class PallindromeStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(IsPallindrome(str));
    }
    static boolean IsPallindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }
}
