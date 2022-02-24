package Sorting;

import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, -6 };
       insertion(nums);
       System.out.println(Arrays.toString(nums));
    }

    static void insertion(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}

//best case o(n)
// worst case o(n^2)