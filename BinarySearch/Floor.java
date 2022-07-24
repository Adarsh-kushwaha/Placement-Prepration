package BinarySearch;

class Floor {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 13;
        int res = floor_pb(nums, target);
        System.out.println(res);
    }

    static int floor_pb(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;

            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return nums[mid];
            }
        }

        return nums[end];
    }

}
