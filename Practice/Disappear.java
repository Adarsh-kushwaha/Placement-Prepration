package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disappear {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.print(allDisp(nums));
    }

    static List<Integer> allDisp(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != correctIndex) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;

    }
}
