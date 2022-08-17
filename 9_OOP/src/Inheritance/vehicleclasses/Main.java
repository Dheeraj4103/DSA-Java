package Inheritance.vehicleclasses;

public class Main {
    public static void main(String[] args){
        Car swift = new Car(5, "1200cc Petrol");
        Truck eicher = new Truck(5, "1500cc Diesel");
        Bike Spledor = new Bike(4, "120cc Petrol");
        Scooty access125 = new Scooty("120cc Petrol");
        System.out.println(Vehicle.count);
        System.out.println(FourWheeler.count);
        System.out.println(Car.count);
        System.out.println(Truck.count);
        System.out.println(TwoWheeler.count);
        System.out.println(Bike.count);
        System.out.println(Scooty.count);
    }
}
