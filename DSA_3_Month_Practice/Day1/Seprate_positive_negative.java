package DSA_3_Month_Practice.Day1;

public class Seprate_positive_negative {
    public static void main(String[] args) {
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        seperate(arr, arr.length);
    }

    static void seperate(int[] arr, int n) {
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i];
            }
        }

        if (j == n) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }
        int k = 0;

        for (int i = 0; i < temp.length; i++) {
            arr[k] = temp[i];
            k++;
        }
    }
}
