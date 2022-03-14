package Recursion;

public class Count_Zero {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(countZero(n));
    }

    static int countZero(int n) {
        int c = 0;
        return helper(n, c);
    }

    private static int helper(int n, int c) {
        if (n/ 10 == 0) {
            return c;
        }
        if (n % 10 == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}
