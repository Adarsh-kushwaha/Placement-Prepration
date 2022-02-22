package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int [] arr = {5,1,1,2,0,0};
        int [] nums = selectionSort(arr);
        System.out.println(Arrays.toString(nums));
    }

    static int [] selectionSort(int[]arr){

    for (int i = 0; i < arr.length; i++) {
        int lastIndex = arr.length-i-1;
        int maxIndex = getMaxIndex(arr, 0, lastIndex);
        swap(arr, maxIndex, lastIndex );
    }
    return arr;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
