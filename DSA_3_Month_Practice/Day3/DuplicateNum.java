package DSA_3_Month_Practice.Day3;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        int ans = duplicate(arr);
        System.out.println(ans);
    }

    static int duplicate(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[Math.abs(arr[i]) - 1] >= 0)
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            else
                return Math.abs(arr[i]);
        }
        return 0;
    }
}
