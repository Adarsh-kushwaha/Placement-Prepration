package Recursion;

import java.util.Arrays;

public class Sum_Triangle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printTriangle(arr);
    }

    static int[] printTriangle(int[] arr) {

        int[] temp = new int[arr.length - 1];

        if (temp.length < 1) {
            return temp;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }

        System.out.println(Arrays.toString(temp));
        return printTriangle(temp);

    }
}
