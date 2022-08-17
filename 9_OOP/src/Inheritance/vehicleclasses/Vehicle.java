package Inheritance.vehicleclasses;

public class Vehicle {
    int wheels;
    int gears;
    int seats;
    String engine;
    static int count;

    Vehicle(){
        this.wheels = 2;
        this.gears = 4;
        this.seats = 2;
        this.engine = "Petrol";
        count++;
    }
}
