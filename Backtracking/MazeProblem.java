package Backtracking;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }

    // finding no of ways to reach at target in a maze
    // for explanation look at copy
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }
}
