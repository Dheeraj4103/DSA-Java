public class NumberExampleRecursion {
    public static void main(String[] args) {
        // Printing first five numbers
        Print(1);
    }
    static void Print(int n){
        // Base Condition
        // when n will be greater than 5
        // function will be returned
        if (n > 5)
            return;
        System.out.println(n);
        // Recursive call of function
        // Tail Recursion:- last line should be function call.
        Print(n+1);
    }
}
