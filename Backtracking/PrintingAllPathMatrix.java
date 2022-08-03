package Backtracking;

import java.util.Arrays;

public class PrintingAllPathMatrix {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        int[][] path = new int[board.length][board[0].length];

        printAllPath("", board, 0, 0, path, 1);
    }

    static void printAllPath(String p, boolean maze[][], int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            printAllPath(p + "D", maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            printAllPath(p + "R", maze, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            printAllPath(p + "U", maze, r - 1, c, path, step + 1);
        }

        if (c > 0) {
            printAllPath(p + "L", maze, r, c - 1, path, step + 1);
        }

        //backtracking steps and chnged boolen values
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
