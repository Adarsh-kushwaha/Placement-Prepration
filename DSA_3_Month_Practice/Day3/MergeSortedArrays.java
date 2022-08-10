package DSA_3_Month_Practice.Day3;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {

        long arr1[] = { 1, 3, 5, 7 };
        long arr2[] = { 0, 2, 6, 8, 9 };
        int n = 4;
        int m = 5;
        merge(arr1, arr2, n, m);

    }

    public static void merge(long arr1[], long arr2[], int n, int m) {
        int i = 0;
        int j = 0;
        while (i < n) {
            if (arr1[i] > arr2[j]) {
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                sortArray2(arr2);
            }

            i++;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void sortArray2(long[] arr2) {
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < arr2[i - 1]) {
                long temp = arr2[i];
                arr2[i] = arr2[i - 1];
                arr2[i - 1] = temp;
            }
        }
    }
}
