package Recursion;

import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Reverse_Integer {
    public static void main(String[] args) {
        int x = 1534;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int digit = (int) (Math.log10(Math.abs(x))) + 1;
        return helper(x, digit);
    }
    
    static int helper(int x, int digit) {
        if (x % 10 == x) {
            return x;
        }

        return (x % 10 )* (int) Math.pow(10, digit - 1) + helper(x / 10, digit - 1);
    }
}
