package Inheritance.vehicleclasses;

public class Scooty extends TwoWheeler{
    static int count;

    Scooty(String engine){
        this.gears = 0;
        this.engine = engine;
        this.count++;
    }
}
