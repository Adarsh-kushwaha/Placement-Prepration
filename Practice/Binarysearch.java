package Practice;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, 11, 45, 24 };
        int t = 45;
        int res = bs(arr, t);
        System.out.println(res);
    }

    public static int bs(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (t > arr[mid]) {
                start = mid + 1;

            } else if (t < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;

    }
}
