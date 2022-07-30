package Practice;

public class SkipChar {
    public static void main(String[] args) {
        String p = "abaabds";
        String ans = skip(p);
        System.out.println(ans);
    }

    static String skip(String p) {
        if (p.isEmpty() == true) {
            return " ";
        }

        char ch = p.charAt(0);
        if (ch == 'a') {
            return skip(p.substring(1));
        } else {
            return ch + skip(p.substring(1));
        }

    }
}
