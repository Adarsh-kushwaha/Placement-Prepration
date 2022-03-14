package Recursion;

public class Count_Number_Steps {
    public static void main(String[] args) {
        System.out.println(countStep(8));
    }

    static int countStep(int n) {
        int s = 0;
        return helper(n, s);
    }

    private static int helper(int n, int s) {
        if (n == 0) {
            return s;
        }

        if (n % 2 == 0) {
            return helper(n / 2, s + 1);
        }
        return helper(n - 1, s + 1);
    }
}
