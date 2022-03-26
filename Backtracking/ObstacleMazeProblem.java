package Backtracking;

public class ObstacleMazeProblem {
    public static void main(String[] args) {
        boolean[][] maze = { { true, true, true }, { true, false, true }, { true, true, true } };
        obstacle(maze, 0, 0, "");
    }

    static void obstacle(boolean[][] maze, int r, int c, String p) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // if there is obstacle means false grid stop the recursion
        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            obstacle(maze, r + 1, c, p + "D");
        }

        if (c < maze.length - 1) {
            obstacle(maze, r, c + 1, p + "R");
        }
    }
}
