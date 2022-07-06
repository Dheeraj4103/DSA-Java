import java.util.Arrays;

public class BacktrackingPrint {
    public static void main(String[] args) {
        boolean maze[][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        AllPaths("", maze, 0, 0, path, 0);
    }

    static void AllPaths(String s, boolean[][] maze, int r, int c, int[][] path, int step){
        // Base Condition if we reached the Target
        if (r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step +1;
            for(int[] itm : path){
                System.out.println(Arrays.toString(itm));
            }
            System.out.println(s);
            System.out.println();
            return;
        }
        // If This section is already visited don't go forward
        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false; // make this false as we are on this section
        // step = level of recursion + 1
        path[r][c] = step +1;
        if (r < maze.length-1){  // go Down
            AllPaths(s+'D', maze, r+1, c, path, step+1);
        }
        if (c < maze[0].length-1){  // go right
            AllPaths(s+'R', maze, r, c+1, path, step+1);
        }
        if (r > 0){ // go up
            AllPaths(s+'U', maze, r-1, c, path, step+1);
        }
        if (c > 0){  // go left
            AllPaths(s+'L', maze, r, c-1, path, step+1);
        }
        // As from this line we will start going back
        // we will make this section true again
        maze[r][c] = true;
        // make step 0 as we Backtrack
        path[r][c] = 0;
    }
}
