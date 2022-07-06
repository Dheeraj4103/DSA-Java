import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter No of Elements:- ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements:- ");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.print("Enter index you want to change:- ");
        int idx = in.nextInt();
        System.out.print("Enter value:- ");
        int val = in.nextInt();
        change(arr, idx, val);
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
        array.main(args);
    }

    static void change(int[] arr, int idx, int val){
        arr[idx] = val;
    }

}
