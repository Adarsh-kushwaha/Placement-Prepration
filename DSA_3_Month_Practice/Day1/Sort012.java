package DSA_3_Month_Practice.Day1;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0 };
        sort120(arr, 5);
        System.out.println(Arrays.toString(arr));
    }

    static void sort120(int[] nums, int n) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        int temp;
        while (mid <= hi) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
}
