package Array;

import java.util.Arrays;

class Array_To_Integer {
    public static void main(String[] args) {
        int [] arr = {1,2,0,0};
        int k = 34;

        int [] res = addToArrayForm(arr, k);
        System.out.println(Arrays.toString(res));
    }

    static int [] addToArrayForm(int[] num, int k) {
        int n=0;
        
        for (int i = 0; i < num.length; i++) {
           n = n + num[i]*(int)Math.pow(10, num.length-i-1);
        }
        int arrSum = n+k;

        String temp = Integer.toString(arrSum);
        int arr[] = new int [temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            arr[i] = temp.charAt(i)-'0';
        }

        return arr;
    }
}
