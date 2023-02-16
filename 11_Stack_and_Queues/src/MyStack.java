public class MyStack {
    private int DEFAULT_SIZE = 10;
    private int top;
    private int size;
    private int[] stack;
    private boolean isDynamic;

    MyStack(int size){
        this.size = size;
        this.stack = new int[this.size];
        this.isDynamic = false;
        this.top = -1;
    }

    MyStack(){
        this.size = DEFAULT_SIZE;
        this.stack = new int[this.size];
        this.isDynamic = true;
        this.top = -1;
    }

    public void push(int value){
        if ((this.top + 1) == this.size){
            if (!isDynamic){
                System.out.println("Stack Overflow");
                return;
            }
            else{
                int[] temp = new int[this.size * 2];
                this.size *= 2;
                for (int i = 0; i <= this.top; i++){
                    temp[i] = this.stack[i];
                }
                this.stack = temp;
            }
        }


        this.top++;
        stack[this.top] = value;
        Display();
    }

    public int pop(){
        if (this.top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }

        int topItem = this.stack[this.top];
        this.top--;
        Display();
        return topItem;
    }
    public void Display() {
        if (this.top == -1){
            System.out.println("Stack is Empty.");
            return;
        }

        System.out.println("----------------------");
        System.out.println("Stack");
        for (int i = this.top; i >= 0; i--){
            System.out.println(this.stack[i]);
        }
        System.out.println("----------------------\n\n ");

    }
}
