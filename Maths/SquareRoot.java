package Maths;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.3f", sqrt(8, 2));
    }

    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0.0;

        // find the sqroot using binary search
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
                root = m;
            }

        }

        double incr = 0.1;

        // find the sqrt till 2 decimal places;
        for (int i = 0; i < p; i++) {
            while (root * root < n) {
                root = root + incr;
            }
            root = root - incr;
            incr = incr / 10;
        }

        return root;
    }
}


// TC= O(logn);