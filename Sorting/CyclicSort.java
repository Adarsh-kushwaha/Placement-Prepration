package Sorting;

import java.util.Arrays;

class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr){
        int i = 0;
        while(i<arr.length){
            //finding the correct index of element
            //Note: If array starts from 0 - n then correct index equal to the arr[i];
            //Note: If array starts from 1 - n then correct index equal to the arr[i] - 1;
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

// swapping function if element does not lie at its correct index.

    static void swap(int [] arr, int start, int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;

    }
}


//worst case time complexity - o(n)
//space complexity - o(1)
