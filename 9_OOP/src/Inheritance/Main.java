package Inheritance;

public class Main {
    public static void main(String[] args){
//        Box box = new Box();
////        box.boxinfo();
//
//        Box box1 = new Box(10.0);
//        //box1.boxinfo();
//
//        Box box2 = new Box(12, 14, 16);
//        //box2.boxinfo();
//
//        Box box3 = new Box(box2);
////        box3.boxinfo();
//
//        BoxWeight boxWeight = new BoxWeight(21, 31, 41, 50);
//        boxWeight.boxweightinfo();

        // let's try to declare a variable of type Box and refer it to instance of BoxWeight
        Box box = new BoxWeight();
        System.out.println(box.l); // box can access l
//        System.out.println(box.weight)
        // above line will give error because a variable will be able to access only those variables that belong
        // to declare type class


    }
}
