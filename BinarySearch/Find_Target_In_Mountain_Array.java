package BinarySearch;

class Find_Target_In_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1,0 };
        int target = 0;
        int result = ans(arr, target);
        System.out.println(result);

    }

    static int ans(int arr[], int target) {
        int peak = peakMountainArray(arr);
        int firstTry = binarySearch(arr, 0, peak, target);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticArray(arr, peak + 1, arr.length - 1, target);

    }

    static int peakMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;

    }

    static int binarySearch(int[] nums, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;

            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int orderAgnosticArray(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] > arr[end]) {
                if (arr[mid] > target) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}


//Time complexity o(logn)
//Space Complexity O(1)