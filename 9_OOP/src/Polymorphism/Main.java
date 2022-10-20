package Polymorphism;

import Access_Modifiers.A;

public class Main extends A {
    public Main(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Main obj = new Main(35, "Dheeraj");
        System.out.println(obj.getClass().getName());

    }
}
