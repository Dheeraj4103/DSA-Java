import java.util.Arrays;

public class mazewithobstacle {
    public static void main(String[] args) {
        boolean maze[][] = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        Paths("", maze, 0, 0);
    }
    static void Paths(String s, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(s);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if (r < maze.length-1){
            Paths(s+'D', maze, r+1, c);
        }
        if (c < maze[0].length-1){
            Paths(s+'R', maze, r, c+1);
        }

    }
}
