package Inheritance.vehicleclasses;

public class Bike extends TwoWheeler {
    static int count;

    Bike(int gears, String engine){
        this.gears = gears;
        this.engine = engine;
        this.count++;
    }

    Bike(String engine){
        this.engine = engine;
        this.count++;
    }
}
