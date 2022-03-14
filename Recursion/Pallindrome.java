package Recursion;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Pallindrome {
    public static void main(String[] args) {
        int x = 1214;
        System.out.println(isPallindrome(x));
    }

    public static boolean isPallindrome(int x){
        if(x == reverse(x)){
            return true;
        }

        return false;
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
