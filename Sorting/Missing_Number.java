package Sorting;

class Missing_Number {
    public static void main(String[] args) {
        int [] nums = {0,1,3};
        int res = missingNumber(nums);
        System.out.println(res);

    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!= nums[correct] ){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int [] arr, int start, int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;

    }
    
}
