package Recursion;

//check whether array is sorted or not

public class IsSortedArray {
    public static void main(String[] args) {
        int [] arr = {2,40,8,9};
        int i = 0;
        System.out.println(sorted(arr, i));
    }

    static boolean sorted(int[] arr, int i) {

        // base condition
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i + 1] && sorted(arr, i + 1);
    }
}
