package singleton;

public class StaticThings {
    public static void main(String[] args) {
        Things.Example();

        // Output will be:-
        // This is a static function.
    }

}

class Things {
    static void Example() {
        System.out.println("This is a static function.");
    }

    void Example1() {
        System.out.println("This is a non static function.");
    }
}
