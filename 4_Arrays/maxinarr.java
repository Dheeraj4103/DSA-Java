import java.util.Scanner;

public class maxinarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println(Max(arr, 0, arr.length));

    }

    static int Max(int[] arr, int st, int end) {
        if (st > end || arr.length == 0)
            return -1;
        int mx = arr[st];
        for (int i = st+1; i <= end; i++)
            mx = (arr[i] > mx ? arr[i] : mx);
        return mx;
    }
}
