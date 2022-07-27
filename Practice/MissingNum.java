package Practice;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int res = cycleSort(nums);
        System.out.println(res);
    }

    // static int checkMissingNum(int[] nums){
    // cycleSort(nums);
    // }

    static int cycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;

    }
}
