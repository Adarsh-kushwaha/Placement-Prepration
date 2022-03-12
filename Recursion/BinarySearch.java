package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,9};
        int target = 5;
        int s = 0;
        int e = arr.length-1;
        search(arr, target, s, e);
    }

    static int search(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (nums[m] == target) {
            return m;
        }

        if (nums[m] > target) {
            return search(nums, target, s, m - 1);
        }

        return search(nums, target, m = 1, e);
    }
}
