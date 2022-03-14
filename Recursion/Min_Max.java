package Recursion;

public class Min_Max {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, -5, -4, 8, 6 };
        int n = arr.length;
        System.out.println(findMinRec(arr, n));
    }

    static int findMinRec(int A[], int n) {
        // if size = 0 means whole array
        // has been traversed
        if (n == 1)
            return A[0];

        return Math.min(A[n - 1], findMinRec(A, n - 1));
    }

}


