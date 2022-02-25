package Array;

import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int nums [] = {1,2,3,4};
        int target = 7;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(target == nums[i] + nums[j]){
                    return new int []  {i,j};
                }
            }
        }

        return new int []  {-1,-1}; 

    }
}
