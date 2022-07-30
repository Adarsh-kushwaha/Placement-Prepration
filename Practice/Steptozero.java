package Practice;

public class Steptozero {
    public static void main(String[] args) {
        int res = countStep(14, 0);
        System.out.println(res);
    }

    static int countStep(int n, int c) {
        if (n == 0) {
            return c;
        } else if (n % 2 == 0) {
            return countStep(n / 2, c + 1);
        }

        return countStep(n - 1, c + 1);
    }
}
