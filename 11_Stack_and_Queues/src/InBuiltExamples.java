public class InBuiltExamples {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(34);
        myStack.push(45);
        myStack.push(54);
        myStack.push(67);
        myStack.push(23);
        myStack.push(78);


        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
