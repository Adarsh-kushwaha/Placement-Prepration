package DSA_3_Month_Practice.Day2;

public class MinJump {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 };
        int ans = minJump(arr);
        System.out.println(ans);
    }

    static int minJump(int arr[]) {

        int ptr = 0;
        int count = -1;
        while (ptr < arr.length - 1) {

            if (arr[ptr] == 0) {
                return -1;
            }

            ptr = ptr + arr[ptr];
            count = count + 1;

        }

        return count;
    }
}
