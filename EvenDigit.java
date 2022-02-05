public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = { 0, 12, -123, 1234 };

        int result = findNumbers(nums);
        System.out.println(result);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (evenDigit(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean evenDigit(int nums) {
        int noOfDigits = digits(nums);
        if (noOfDigits % 2 == 0) {
            return true;
        }
        return false;

    }

    static int digits(int nums) {
        if (nums < 0) {
            nums = nums * -1;
        }

        if (nums == 0) {
            return -1;
        }

        int count = 0;

        while (nums > 0) {
            count++;
            nums = nums / 10;
        }

        return count;
    }

}
