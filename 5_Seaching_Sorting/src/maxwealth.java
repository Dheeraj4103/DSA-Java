import java.util.Scanner;

public class maxwealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                arr[i][j] = in.nextInt();
        }
        System.out.println(MaxWealth(arr));
    }
    static int MaxWealth(int[][] arr){
        int mx = 0;
        for (int[] person : arr){
            int acc = 0;
            for (int amt : person)
                acc += amt;
            mx = (acc > mx ? acc : mx);
        }
        return mx;
    }
}
