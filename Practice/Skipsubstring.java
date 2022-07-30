package Practice;

public class Skipsubstring {
    public static void main(String[] args) {
        String p = "opoeaappleadad";
        String ans = skip(p);
        System.out.println(ans);
    }

    static String skip(String p) {

        if (p.isEmpty() == true) {
            return " ";
        }

        char ch = p.charAt(0);
        if (p.startsWith("apple")) {
            return skip(p.substring(5));
        } else {
            return ch + skip(p.substring(1));
        }
    }
}
