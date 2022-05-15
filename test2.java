public class test2 {

    public static void main(String[] args) {
        int x = solve(2,3);
        System.out.println(x);

       
    }

    public static int solve(int A, int B) {
        int count = 0;
        for (int i = 1; i <= A; i++) {
            int x = fac(i) + B;
            System.out.println(x);
            if (isPrime(x)) {
                count=count+1;
            }
        }
        return count;
    }

    public static int fac(int A) {

        return (A==1||A==0)?1: A * fac(A - 1);
    }

    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
