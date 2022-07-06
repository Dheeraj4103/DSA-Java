

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Add();
    }

    // Function for addition
    static void Add() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int n1 = in.nextInt();
        System.out.print("Enter Second Number:- ");
        int n2 = in.nextInt();
        int sm = n1 + n2;
        System.out.println("Sum = " + sm);
    }
}
