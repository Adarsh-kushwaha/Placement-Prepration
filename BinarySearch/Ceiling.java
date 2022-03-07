package BinarySearch;

class Ceiling {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 17;
        int res = ceiling_pb(nums, target);
        System.out.println(res);
    }

    static int ceiling_pb(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if (target >= nums[nums.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target == nums[mid]){
                return nums[mid];
            }

            if (nums[mid] > target) {
                end = mid-1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } 
            return nums[end];
        }
        return -1;
    }

}
