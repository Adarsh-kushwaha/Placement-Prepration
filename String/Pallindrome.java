package String;

class Pallindrome {
    public static void main(String[] args) {
        int x = 1213;
        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }

    static boolean isPalindrome(int x) {

        String str = String.valueOf(x);

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
