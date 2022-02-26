package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Find_Disappeared_Numbers_In_Array {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        // cyclic sort just ignore the duplicate number

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if ( nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Finding missing number

        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(j + 1);
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
