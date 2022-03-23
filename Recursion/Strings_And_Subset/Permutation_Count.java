package Recursion.Strings_And_Subset;

public class Permutation_Count {

    public static void main(String[] args) {
        int ans = permutaionCount("", "abc");
        System.out.println(ans);
    }

    static int permutaionCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        // it has varaible number of recurssion call at each step that's why we are
        // using for loop
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            // inserting element around the processed string
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutaionCount(f + ch + s, up.substring(1));
        }

        return count;
    }

}