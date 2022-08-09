package DSA_3_Month_Practice.Day2;

public class KadanesAlgo {
    public static void main(String[] args) {

    }

    static long sunArray(int arr[], int n) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }
}
