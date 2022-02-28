package Array;

class Max_SubArray {
    public static void main(String[] args) {
        int[] nums = { -2,1,-3,4,-1,2,1,-5,4 };
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int res = nums[0];

        int maxEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEnding = Math.max(maxEnding + nums[i], nums[i]);

            res = Math.max(maxEnding, res);
        }

        return res;
    }
}
