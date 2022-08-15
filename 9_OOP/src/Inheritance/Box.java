package Inheritance;

public class Box {
    double l; // length of the box
    double h; // height of the box
    double w; // width of the box

    // below constructor will be called when no arguments are passed
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // when we have a cube we will call this constructor
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    // when we give three arguments, this constructor will be called
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // when we pass an old box we will call this contructor
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    // function to display box information
    void boxinfo (){
        System.out.println("Length of the box is " + this.l);
        System.out.println("Height of the box is " + this.h);
        System.out.println("Width of the box is " + this.w);
    }
}
