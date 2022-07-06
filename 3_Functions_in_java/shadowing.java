public class shadowing {
    /* this variable will be hidden if 
    another variable with same name will be defined
    in overlapping scope*/
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);// class global x
        int x;
        x = 40; // scope will begin when value is intialized
        System.out.println(x);// local x
        func();
    }
    
    static void func() {
        System.out.println(x);
    }
}
