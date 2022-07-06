import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
       StringBuilder series = new StringBuilder();
       // In this case String object will be created only
        // once and changes will be done with that object only.

        for (int i = 0; i < 26; i++){
            char ch = (char)('a'+i);
            series.append(ch);
        }
        System.out.println(series);
//        series.reverse();
        String name = "Dheeraj Jadhav";
        System.out.println(Arrays.toString(name.split(" ")));
    }

}
