package Sorting;

 class DuplicateNumber {
    public static void main(String[] args) {
        int [] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if ( nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        return nums[nums.length-1];
    }

    static void swap(int[] arr, int start, int second) {
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;

    }

}
