package Recursion.Strings_And_Subset;

//Skip the string

public class SkipTheString {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String p = "abc";
        String ans = skipString(s, p);
        System.out.println(ans);
    }

    static String skipString(String s, String p) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith(p)) {

            return skipString(s.substring(p.length()), p);

        } else {
            return s.charAt(0) + skipString(s.substring(1), p);
        }

    }
}
