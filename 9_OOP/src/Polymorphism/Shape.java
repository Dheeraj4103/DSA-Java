package Polymorphism;

public class Shape {
    // Late binding
    void area() {
        System.out.println("I am area of Shape");
    }
// Early binding
    // also we can prevent inheritance
//   final void area() {
//        System.out.println("I am area of Shape");
//    }
    void area1() {
        System.out.println("I am area1");
    }


}
