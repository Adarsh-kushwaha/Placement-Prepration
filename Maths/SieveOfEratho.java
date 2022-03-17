package Maths;

public class SieveOfEratho {
    public static void main(String[] args) {

        int n = 40;
        boolean[] arr = new boolean[n + 1];
        sieve(arr, n);
    }

    static void sieve(boolean[] arr, int n) {
        // checking till sqrt(n) times becoz factor repeat itseld after it
        for (int i = 2; i * i < n; i++) {
            if (!arr[i]) {
                // marking true to all non-prime number or number that is factor of i;
                for (int j = 2 * i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}


// TC - O(n(log(logn)));
// SC = o(N)