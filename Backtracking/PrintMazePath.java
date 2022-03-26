package Backtracking;

public class PrintMazePath {
    public static void main(String[] args) {
        printPath("", 3, 3);
    }

    // same Maze problem but this time you have to print the path

    static void printPath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            printPath(p + "D", r - 1, c);
        }
        if (c > 1) {
            printPath(p + "R", r, c-1);
        }
    }
}
