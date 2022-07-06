import java.util.Scanner;

public class counteven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println(GetEven(arr));
    }
    static boolean even(int digit){
        int cnt = (int) (Math.log10(digit) +1);
//        System.out.println(cnt);
        return cnt % 2 == 0;
    }
    static int GetEven(int[] arr){
        if (arr.length == 0)
            return -1;
        int cnt = 0;
        for (int num : arr)
            cnt += (even(num) ? 1 : 0);
        return cnt;
    }
}
