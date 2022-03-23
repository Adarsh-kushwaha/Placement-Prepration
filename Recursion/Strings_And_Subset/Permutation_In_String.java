package Recursion.Strings_And_Subset;

import java.util.ArrayList;

public class Permutation_In_String {
    public static void main(String[] args) {
        ArrayList<String> ans = permutaion2("", "abc");
        System.out.println(ans);
    }

    static void permutaion(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        // it has varaible number of recurssion call at each step that's why we are
        // using for loop
        for (int i = 0; i <= p.length(); i++) {
            // inserting element around the processed string
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutaion(f + ch + s, up.substring(1));
        }
    }


    //Method 2

    static ArrayList<String> permutaion2(String p, String up) {
        if (up.isEmpty()) {
           ArrayList<String> ans = new ArrayList<>();
           ans.add(p);
           return ans;
        }

        char ch = up.charAt(0);
        // it has varaible number of recurssion call at each step that's why we are
        // using for loop
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            // inserting element around the processed string
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutaion2(f + ch + s, up.substring(1)));
        }

        return ans;
    }


}
