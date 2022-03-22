package Recursion.Strings_And_Subset;

//Question - skip app not apple

public class SkipNotReuireString {
    public static void main(String[] args) {
        String s = "mynameisapple";
        String ans = skipNotRequiredString(s);
        System.out.println(ans);
    }

    static String skipNotRequiredString(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("app") && !s.startsWith("apple")) {

            return skipNotRequiredString(s.substring(3));

        } else {
            return s.charAt(0) + skipNotRequiredString(s.substring(1));
        }

    }
}
