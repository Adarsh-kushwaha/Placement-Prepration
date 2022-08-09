package DSA_3_Month_Practice.Day2;

import java.util.Arrays;

public class OneRoatation {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;

        rotate(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int n) {
        int x = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;

    }
}
