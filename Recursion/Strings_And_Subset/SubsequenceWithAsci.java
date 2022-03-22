package Recursion.Strings_And_Subset;

public class SubsequenceWithAsci {
    public static void main(String[] args) {
        subsAsc("abs", "");
    }

    static void subsAsc(String s, String p) {
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = s.charAt(0);

        subsAsc(s.substring(1), p + ch);
        subsAsc(s.substring(1), p);
        subsAsc(s.substring(1), p+(ch + 0));
    }

}
