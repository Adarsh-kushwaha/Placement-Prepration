package BinarySearch;

public class SqrRoot {
    public static void main(String[] args) {
        int x = 17;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int res = 0;
        if (x < 2) {
            return x;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }

            else if (mid * mid > x) {
                res = mid;
                start = mid + 1;

            } else {
                end = mid;
            }

        }

        return (int) res;
    }
}