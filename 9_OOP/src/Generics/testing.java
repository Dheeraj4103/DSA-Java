package Generics;

import java.util.ArrayList;

public class testing {
    public static void main(String[] args) {
        CustomArrayList<Integer> ans = new CustomArrayList<>();
        ans.add(4);
        ans.add(45);

//        System.out.println(ans);
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("how");
        list.add("are");
        list.add("you");




        System.out.println(list);
    }

}
