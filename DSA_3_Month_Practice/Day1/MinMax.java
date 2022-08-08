package DSA_3_Month_Practice.Day1;

public class MinMax {
    public static void main(String[] args) {
        int [] arr = {1,20,80,-9,21};
        int max = maxElem(arr);
        int min = minElem(arr);
        System.out.println(max + " " + min);
    }

    static int maxElem(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int minElem(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
