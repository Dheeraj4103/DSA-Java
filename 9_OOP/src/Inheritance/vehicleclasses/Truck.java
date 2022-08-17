package Inheritance.vehicleclasses;

public class Truck extends FourWheeler {
    static int count;

    Truck(int gears, String engine){
        this.gears = gears;
        this.engine = engine;
        this.count++;
    }

    Truck(String engine){
        this.engine = engine;
        this.count++;
    }
}
