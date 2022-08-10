package DSA_3_Month_Practice.Day3;

public class MinJump {
    public static void main(String[] args) {

    }

    static int jump(int[] arr) {
        int jump = 0;
        int des = 0;
        int pos = 0;

        if (arr.length == 1) {
            return 1;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            des = Math.max(des, arr[i] + i);

            if (pos == i) {
                pos = des;
                jump++;
            }
        }

        return jump;
    }
}
