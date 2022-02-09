package BinarySearch;

class Duplicate_Roatated_Array {
    public static void main(String[] args) {
        int[] nums = { 3,0,0,1,2,2};
        // int target = 1;
        // boolean result = search(nums, target);
        // System.out.println(result);

        int index = findPeakElemInDup(nums);
        System.out.println(index);

    }

    static boolean search(int[] nums, int target) {
        int pivot = findPeakElemInDup(nums);

        if (pivot == -1) {
            int index = binarySearch(nums, target, 0, nums.length - 1);
            if (index == -1) {
                return false;
            }
            return true;
        }

        if (nums[pivot] == target) {
            return true;
        }

        if (nums[0] <= target) {
            int index = binarySearch(nums, target, 0, pivot - 1);
            if (index == -1) {
                return false;
            }
            return true;
        } else {
            int index = binarySearch(nums, target, pivot + 1, nums.length - 1);
            if (index == -1) {
                return false;
            }
        }

        return true;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
            // the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    static int findPeakElemInDup(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
