import java.util.Arrays;

import javax.print.DocFlavor.STRING;

public class PhoneNum {
    public static void main(String[] args) {
        String s = "double one";
        getPhoneNumber(s);

    }

    // public static int rep(String rep)

    public static int check(String word) {
        if (word == "one") {
            return 1;
        }
        return -1;
    }

    public static String getPhoneNumber(String s) {
        // Write your code here
        String nums[] = s.split(" ");

        // StringBuilder phone = new StringBuilder();
        int[] word = {};

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == "double") {
                int phone = check(nums[i + 1]);
                word[i] = phone;
            }
        }
       

        return s;

    }
}
