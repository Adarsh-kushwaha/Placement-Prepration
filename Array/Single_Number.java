package Array;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 4, 5, 6, 6 };
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        int number = 0;
        for (int i : nums) {
            number = number ^ i;
        }

        return number;
    }

}
