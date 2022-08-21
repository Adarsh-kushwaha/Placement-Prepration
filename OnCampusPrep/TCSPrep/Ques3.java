package OnCampusPrep.TCSPrep;
//https://prepinsta.com/tcs-coding-questions/question-1/

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        int res = ((4 * v) - w) / 2;

        if (w >= 2 && (w % 2 == 0) && w > v) {
            System.out.println("TW= " + (int) (res) + " FW= " + (int) (v - res));
        }else{
            System.out.println("INVALID INPUT");
        }
    }
}
