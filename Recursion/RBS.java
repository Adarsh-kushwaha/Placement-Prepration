package Recursion;

public class RBS {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        int t = 2;
        int e = arr.length - 1;
        System.out.println(rbs(arr, t, 0, e));
    }

    static int rbs(int[] arr, int t, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == t) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (t >= arr[s] && t <= arr[m]) {
                return rbs(arr, t, s, m - 1);
            } else {
                return rbs(arr, t, m + 1, e);
            }
        } else {
            if (t >= arr[m] && t <= arr[e]) {
                return rbs(arr, t, m + 1, e);
            } else {
                return rbs(arr, t, s, m - 1);
            }
        }

    }
}
