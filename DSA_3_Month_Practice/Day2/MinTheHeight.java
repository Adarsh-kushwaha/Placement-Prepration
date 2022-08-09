package DSA_3_Month_Practice.Day2;

//problem - https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1

//Dimmag kharaab kr diya isne to

import java.util.Arrays;

public class MinTheHeight {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 4, 7, 2, 10, 3, 2, 1 };
        int ans = maxMinDiff(arr, 10, 5);
        System.out.println(ans);
    }

    static int maxMinDiff(int arr[], int n, int k) {
        Arrays.sort(arr);
        // Maximum possible height difference
        int ans = arr[n - 1] - arr[0];

        int tempmin, tempmax;
        tempmin = arr[0];
        tempmax = arr[n - 1];

        for (int i = 1; i < n; i++) {

            // if on subtracting k we got negative then
            // continue
            if (arr[i] - k < 0)
                continue;

            // Minimum element when we add k to whole array
            tempmin = Math.min(arr[0] + k, arr[i] - k);

            // Maximum element when we subtract k from whole
            // array
            tempmax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
    }
}
