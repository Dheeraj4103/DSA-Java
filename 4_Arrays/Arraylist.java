import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList list = new ArrayList(10);
        // taking elements in list
        for (int i = 0; i < 5; i++)
            list.add(in.nextInt());
        // printing list
        System.out.println(list);
        // check if list contains required element
        System.out.println(list.contains(2));
        System.out.println(list.contains(45));
        // changing elements
        list.set(0, 100);
        System.out.println(list);
        // removing an element
        list.remove(2);
        System.out.println(list);
    }
}
