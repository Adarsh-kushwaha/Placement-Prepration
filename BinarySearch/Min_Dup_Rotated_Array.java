package BinarySearch;

public class Min_Dup_Rotated_Array {
public static void main(String[] args) {
    
}
    
    static public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (end == 0)
            return nums[0];// if size of array is 1 returning the single value of array

        if (nums[0] < nums[end])
            return nums[0];// if array is already sorted in such way that nums[0]<nums[end]
                           // that means nums[0] is the smallest value

        while (start <= end) {

            if (nums[start] == nums[end]) {// decreasing equal values
                start++;
                end--;

                if (nums[start] > nums[start - 1] && nums[end] > nums[end + 1]) {// checking if the value we decreased
                                                                                 // is not the smallest
                                                                                 // if it is then that's our answer
                    return nums[start - 1];
                }
            }

            int mid = start + ((end - start) / 2);

            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1])
                return nums[mid + 1];// This is to catch smaller valuse next to bigger value
            else if (mid > 0 && nums[mid] < nums[mid - 1])
                return nums[mid]; // This is same as the upper one but little different

            else if (nums[end] < nums[start]) {// if the condition is right that means our val is present between start
                                               // and end

                if (nums[mid] < nums[start]) {// if condition is true then that means our val is b/w start and mid
                    end = mid + 1;
                } else { // else that means our val is b/w mid and end
                    start = mid + 1;
                }
            } else if (nums[start] < nums[end]) {// it says after decreasing same values ( if nums[start]<nums[end] that
                                                 // means our val is nums[start])
                return nums[start];
            }
        }

        return nums[end];// for edge cases
    }
}
