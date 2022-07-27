package Practice;

import java.util.Arrays;

public class Ss {
    public static void main(String[] args) {
        int [] nums = {5,1,1,10,0,0};
        int [] arr = selectionSort(nums);
        System.out.println(Arrays.toString(arr));
    }

    public static int [] selectionSort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int end = nums.length - i - 1;
            int maxIndexVal = maxIndex(nums, 0, end);
            swapPos(maxIndexVal, end, nums);

        }

        return nums;
    }

    static int maxIndex(int[] nums, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swapPos(int first, int second, int[] nums) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
