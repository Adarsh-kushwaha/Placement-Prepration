package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AllDuplicateNumbers {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        
        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }

        return ans;

    }

    static void swap(int[] arr, int start, int second) {
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;

    }
}
