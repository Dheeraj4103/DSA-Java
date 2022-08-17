package Inheritance.vehicleclasses;

public class FourWheeler extends Vehicle {
    static int count;
    FourWheeler() {
        this.wheels = 4;
        this.gears = 5;
        this.engine = "Petrol";
        this.count++;
    }
}
