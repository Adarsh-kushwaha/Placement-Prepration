package Practice;

import java.util.Arrays;

public class Bs {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 2, 3, 1 };
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            Boolean swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }
}
