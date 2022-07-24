package Practice;

public class Tpm {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 3, 2, 0 };
        int t = 3;
        int res = ans(arr, t);
        System.out.println(res);

    }

    static int ans(int[] arr, int t) {
        int pi = peakIndex(arr);
        int firstTry = bs(arr, 0, pi, t);
        if (firstTry != -1) {
            return firstTry;
        }

        return obs(arr, pi + 1, arr.length - 1, t);

    }

    public static int peakIndex(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }

        return s;
    }

    public static int bs(int[] arr, int start, int end, int t) {
        // int start = 0;
        // int end = arr.length - 1;

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

    public static int obs(int[] arr, int start, int end, int t) {
        // int start = 0;
        // int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (t > arr[mid]) {
                end = mid - 1;

            } else if (t < arr[mid]) {

                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }

}
