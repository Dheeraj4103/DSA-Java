package Inheritance.vehicleclasses;

public class TwoWheeler extends Vehicle {
    static int count;
    TwoWheeler() {
        this.wheels = 2;
        this.gears = 4;
        this.engine = "Petrol";
        this.count++;
    }
}
