package Practice;

public class Subseq {
    public static void main(String[] args) {
        String p = "";
        String up = "abc";
        subSeq(up, p);
    }

    static void subSeq(String up, String p) {
        if (up.isEmpty() == true) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(up.substring(1), p );
        subSeq(up.substring(1), p + ch);
    }
}
