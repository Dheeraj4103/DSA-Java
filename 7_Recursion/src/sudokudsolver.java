public class sudokudsolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    private static void display(char[][] board) {
        for (char[] row : board){
            for (char itm : row){
                System.out.print(itm + " ");
            }
            System.out.println();
        }
    }

    static boolean solve(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean  notempty = true;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == '.'){
                    row=  i;
                    col = j;
                    notempty = false;
                    break;
                }
            }
            if (!notempty){
                break;
            }
        }

        if (notempty){
            return true;
        }

        for (int i = 1; i <= 9; i++){
            char value = (char)('0'+i);
            if (isSafe(board, row, col, value)){
                board[row][col] = value;
                if (solve(board)){
                    return true;
                } else {
                    board[row][col] = '.';
                }

            }
        }
        return false;
    }

    private static boolean isSafe(char[][] board, int row, int col, char value) {
        for (int i = 0; i < board.length; i++){
            if (board[row][i] == value){
                return false;
            }
        }

        for (char[] nums : board){
            if (nums[col] == value){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowst = row - row%sqrt;
        int colst = col - col%sqrt;

        for (int i = rowst; i < rowst + sqrt; i++){
            for (int j = colst; j < colst + sqrt; j++){
                if (board[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }
}
