package DSA_3_Month_Practice.Day1;

import java.util.Arrays;

public class kth_Largest_smallest_elem {
    public static void main(String[] args) {
        int [] arr = {1,7,10,4,3,20};
        kthelem(arr, 3);
    }

    static void kthelem(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[k-1]);
        System.out.println(arr[arr.length - k]);    
    }
}
