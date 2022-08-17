package Inheritance.vehicleclasses;

public class Car extends FourWheeler {
    boolean amt;
    static int count;

    Car(int gears, String engine){
        this.gears = gears;
        this.engine = engine;
        this.amt = false;
        this.count++;
    }

    Car(String engine){
        this.engine = engine;
        this.amt = true;
        this.count++;
    }
}
