package Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight){
        // calling parent class constructor
        super(l, h, w);
        this.weight = weight;

    }

    void boxweightinfo(){
        System.out.println(this.l);
        System.out.println(this.h);
        System.out.println(this.w);
        System.out.println(this.weight);
    }
}
