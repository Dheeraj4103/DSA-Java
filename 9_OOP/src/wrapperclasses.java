public class wrapperclasses {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 45;

        swap(a, b);
        System.out.println(a+" "+ b); // doesn't swap the value
        // the reason is final keyword

        final Integer A = 10;
        //A = 12; // cannot modify value of A
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
