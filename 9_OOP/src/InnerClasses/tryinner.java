package InnerClasses;

public class tryinner {
    static class Test {
        static String name;
        Test(String name) {
            Test.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Dheeraj");
        Test b = new Test("Suraj");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
