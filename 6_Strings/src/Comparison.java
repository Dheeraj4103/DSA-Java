public class Comparison {
    public static void main(String[] args) {
        // created a new object "Dheeraj"
        String a = new String("Dheeraj");
        // Created another object "Dheeraj"
        String b = new String("Dheeraj");
        // == check if reference variables are
        // pointing towards same object
        System.out.println("== -> "+ (a == b));
        // .equals to method checks the value
        System.out.println(".equals -> "+a.equals(b));
    }
}
