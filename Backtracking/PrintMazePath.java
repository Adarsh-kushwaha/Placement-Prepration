package Backtracking;

import java.util.ArrayList;

public class PrintMazePath {
    public static void main(String[] args) {
        // printPath("", 3, 3);
        System.out.println(printAllPath("", 3, 3));
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
            printPath(p + "R", r, c - 1);
        }
    }

    // Now considering diagonal step also and this time print the arraylist

    static ArrayList<String> printAllPath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            ArrayList<String> left = printAllPath(p + "D", r - 1, c);
            list.addAll(left);

        }
        if (c > 1) {
            ArrayList<String> right = printAllPath(p + "R", r, c - 1);
            list.addAll(right);

        }
        if (r > 1 && r > 1) {
            ArrayList<String> diagonal = printAllPath(p + "d", r - 1, c - 1);
            list.addAll(diagonal);

        }

        return list;
    }

}
