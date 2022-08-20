//Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”

package OnCampusPrep.TCSPrep;

import java.util.Arrays;
import java.util.Scanner;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        flipTheBit(n);
    }

    static void flipTheBit(int n) {

        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        char[] binaryArr = binary.toCharArray();
        System.out.println(Arrays.toString(binaryArr));

        for (int i = 0; i < binaryArr.length; i++) {
            if (binaryArr[i] == '0') {
                binaryArr[i] = '1';
            } else {
                binaryArr[i] = '0';
            }

        }

        System.out.println(Arrays.toString(binaryArr));

        String binStr = new String(binaryArr);
        int ans = Integer.parseInt(binStr,2);

        System.out.println(ans);

    }
}