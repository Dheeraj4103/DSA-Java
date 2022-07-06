
import java.util.ArrayList;

public class NQueens {
    public static void main(String[] args) {
        int n = 6;
        boolean[][] board = new boolean[n][n];
        System.out.println(Countways(board, 0));

    }
    static int Countways(boolean[][] board, int r){
        // when row is out of index return ans;
        if (r >= board.length){
            Dispay(board);
            System.out.println();
            return 1;
        }
        // count variable to count no of ans;
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            // if cell is safe go forward with it
            boolean top = isSafe(board, r-1, i, -1, 0);
            boolean topright = (top ? isSafe(board, r-1, i+1, -1, 1) : false);
            boolean topleft = (topright ? isSafe(board, r-1, i-1, -1, -1) : false);
            if (top && topright && topleft){
                board[r][i] = true;
                count += Countways(board, r+1);
                board[r][i] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int c, int i, int j) {
        if (r < 0 || c < 0 || c >= board.length){
            return true;
        }
        if (board[r][c]){
            return false;
        }
        return isSafe(board, r+i, c+j, i, j);
    }

    private static void Dispay(boolean[][] board) {
        for (boolean[] itm : board){
            for (boolean cell : itm){
                if (cell){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
