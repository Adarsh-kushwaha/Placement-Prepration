package Array;

import java.util.Arrays;

public class Product_Of_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static int[] productExceptSelf(int[] nums) {
        int[] arr = new int [nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = product*nums[i];
            arr[i]= product;
        }

        return arr;
    }
}
