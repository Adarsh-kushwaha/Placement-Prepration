package Recursion.Strings_And_Subset;

//PROBLEM - https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.lang.reflect.Array;
import java.util.ArrayList;

//Doing via a concept of asci method.

public class MobilePadLetterComb {
    public static void main(String[] args) {
        ArrayList<String> ans = mobPad2("", "23");
        System.out.println(ans);
    }

    static void mobPad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        // this will convert '2' into 2
        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            mobPad(p + ch, up.substring(1));
        }
    }

    // By List Method

    static ArrayList<String> mobPad2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // this will convert '2' into 2
        int digit = up.charAt(0) - '0';

        int start = 0;
        int end = 0;
        if (digit >= 2 && digit <= 6) {
            start = (digit - 2) * 3;
            end = (digit - 1) * 3;
        }
        if (digit == 7) {
            start = 15;
            end = 19;
        }
        if (digit == 8) {
            start = 19;
            end = 22;
        }
        if (digit == 9) {
            start = 22;
            end = 26;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            list.addAll(mobPad2(p + ch, up.substring(1)));
        }

        return list;
    }
}
