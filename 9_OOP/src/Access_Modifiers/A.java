package Access_Modifiers;

public class A {
    protected int num;
    String name;
    int[] arr;

    // getter of num, indirectly getting the value of num
    public int getNum() {
        return num;
    }

    // setter of num, indirectly setting the value of num
    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
