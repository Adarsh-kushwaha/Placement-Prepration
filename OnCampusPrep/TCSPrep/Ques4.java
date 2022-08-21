package OnCampusPrep.TCSPrep;
//https://prepinsta.com/tcs-coding-questions/question-2/

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = printNum(str);
        System.out.println(ans);

    }

    static int printNum(String str) {
        int sc = 0;
        int hc = 0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '*') {
                sc++;
            } else if (charArr[i] == '#') {
                hc++;
            }
        }
        int ans = sc - hc;
        return ans;
    }
}
