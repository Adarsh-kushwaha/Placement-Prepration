package DSA_3_Month_Practice.Day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumPairK {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1 };
        int target = 2;
        int[] ans = getPairsCount(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getPairsCount(int[] nums, int target) {
        int[] answer = new int[2];
        // Two for loops for selecting two numbers and check sum equal to target or not

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // j = i + 1; no need to check back elements it covers in i;
                if (nums[i] + nums[j] == target) {
                    // Check sum == target or not
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return null;
    }
}
