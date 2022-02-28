package Array;

import java.util.Arrays;

class Sum_Up_Zero {

    public static void main(String[] args) {
        int n = 1;
        int[] res = sumZero(n);
        System.out.println(Arrays.toString(res));
    }

    static int[] sumZero(int n) {
        int arr[] = new int[n];
        if(n==1){
            return new int [] {0};
         }
        arr[0] = -1 * n;

       
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                arr[i] = -1 * arr[i - 1];
            } else {
                arr[i] = -1 * arr[i - 1] - 1;
            }
            if (n % 2 != 0) {
                arr[n - 1] = 0;
            }
        }

        return arr;
    }
}
