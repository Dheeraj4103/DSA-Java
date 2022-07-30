package singleton;

public class SingleObjects {
    public static void main(String[] args) {
        SingleTon obj = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        SingleTon obj3 = SingleTon.getInstance();

        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
