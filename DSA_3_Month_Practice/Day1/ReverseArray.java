package DSA_3_Month_Practice.Day1;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6};
	int[] ans = reverse(arr);
    System.out.println(Arrays.toString(ans));
    }

    static int[] reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
        
        while(s<=e){
            swap(s,e, arr);
            s++;
            e--;
        }
        
        return arr;
    }
    
    static void swap(int s, int e, int[] arr){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
