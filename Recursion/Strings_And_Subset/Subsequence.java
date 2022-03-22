package Recursion.Strings_And_Subset;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        ArrayList<String> ans = subs2("aba", "");
        System.out.println(ans);

    }

    static void subs(String s, String p) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = s.charAt(0);

        subs(s.substring(1), p + ch);
        subs(s.substring(1), p);
    }

    // Returming Array list

    static ArrayList<String> subs2(String s, String ans) {
        if (s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = s.charAt(0);

        ArrayList<String> left = subs2(s.substring(1), ans + ch);
        ArrayList<String> right = subs2(s.substring(1), ans);

        left.addAll(right);
        return left;
    }
}
