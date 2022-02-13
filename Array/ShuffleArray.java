package Array;

import java.util.Arrays;

class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        int n = 1;
        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        if (n == 0 || n == 1) {
            return nums;
        }

        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                arr[i] = nums[j++];
            } else {
                arr[i] = nums[n++];
            }
        }

        return arr;
    }
}