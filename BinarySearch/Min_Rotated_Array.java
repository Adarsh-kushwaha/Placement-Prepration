package BinarySearch;

public class Min_Rotated_Array {

    public static void main(String[] args) {
        int[] nums = { 1, 4, 8, 10 };
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]){
                return nums[mid];
            }
            
            if(nums[start] <= nums[mid] && nums[end] <= nums[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return nums[start];
    }
}
