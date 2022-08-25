package Matrix;

import java.util.Scanner;

//https://prepinsta.com/tcs-coding-questions/question-5/
public class MaxGuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int slot = sc.nextInt();
        int[] entry = new int[slot];
        int[] leaving = new int[slot];

        System.out.println("entry guest");
        for (int i = 0; i < slot; i++) {
            entry[i] = sc.nextInt();
        }

        System.out.println("leaving guest");
        for (int i = 0; i < slot; i++) {
            leaving[i] = sc.nextInt();
        }

        System.out.println(maxGuest(entry, leaving, slot));
    }

    static int maxGuest(int[] entry, int[] leaving, int slot) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < slot; i++) {
            sum += entry[i] - leaving[i];
            max = Math.max(sum, max);
        }

        return max;
    }
}
