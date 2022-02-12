package Array;

 class Running_Sum_Array {
    public static void main(String[] args) {
        
    }

    int[] runningSum(int[] nums) {
        int [] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans [i] = sum;
        }

        return ans;
    }
}
