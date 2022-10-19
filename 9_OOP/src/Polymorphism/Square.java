package Polymorphism;

public class Square extends Shape {
    @Override
    void area() {
        System.out.println("side * side");
    }
    @Override
    public String toString(){
        return "ObjectPrint";
    }

    public static void main(String[] args) {
        Shape square = new Square();
        square.area();
        square.area1();
        System.out.println(square);
    }
}
