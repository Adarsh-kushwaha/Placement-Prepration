package Array;

import java.util.Arrays;

class Array_From_Permutation{

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4,5};
        int[] res = buildArr(arr);
        System.out.println(Arrays.toString(res));

    }

    static int[] buildArr(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;

    }
}
