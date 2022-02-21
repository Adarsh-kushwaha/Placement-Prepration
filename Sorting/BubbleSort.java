package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(1%2);
    }

    static void sortColors(int[] nums) {
        boolean swapped;
        //run the step n-1 times
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            //for each pass largest element will come at last index
            for (int j = 1; j < nums.length-i; j++) {
                //swapping the element
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped == true){
                break;
            }
        }
    }
}

