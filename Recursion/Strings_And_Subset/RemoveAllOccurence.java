package Recursion.Strings_And_Subset;

//remove all occurence of a from string

public class RemoveAllOccurence {
    public static void main(String[] args) {
        String s = "bacad";
        // String ans = "";
        String ans = removeOcc2(s);
        System.out.println(ans);
    }

    // Method 1 (T- O(n), S-O(n))
    static void removeOcc(String s, String ans) {

        // base condition check wheather the s string is empty or not
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(0);

        if (ch == 'a') {
            removeOcc(s.substring(1), ans);
        } else {
            removeOcc(s.substring(1), ans + ch);
        }

    }

    // Method 2 (T- O(n), S-O(n))

    static String removeOcc2(String s) {

        // base condition check wheather the s string is empty or not
        if (s.isEmpty()) {
            return s;
        }

        char ch = s.charAt(0);

        if (ch == 'a') {
            return removeOcc2(s.substring(1));
        } else {
            return ch + removeOcc2(s.substring(1));
        }

    }

}
