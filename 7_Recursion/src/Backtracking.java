public class Backtracking {
    public static void main(String[] args) {
        boolean maze[][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        AllPaths("", maze, 0, 0);
    }

    static void AllPaths(String s, boolean[][] maze, int r, int c){
        // Base Condition if we reached the Target
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(s);
            return;
        }
        // If This section is already visited don't go forward
        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false; // make this false as we are on this section

        if (r < maze.length-1){  // go Down
            AllPaths(s+'D', maze, r+1, c);
        }
        if (c < maze[0].length-1){  // go right
            AllPaths(s+'R', maze, r, c+1);
        }
        if (r > 0){ // go up
            AllPaths(s+'U', maze, r-1, c);
        }
        if (c > 0){  // go left
            AllPaths(s+'L', maze, r, c-1);
        }
        // As from this line we will start going back
        // we will make this section true again
        maze[r][c] = true;
    }
}
