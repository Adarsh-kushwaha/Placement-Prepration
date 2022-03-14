package Recursion;

public class Product_of_digit {
    public static void main(String[] args) {
        System.out.println(pro(125));
    }

    static int pro(int n) {
        if (n%10==n) {
            return n;
        }
        return pro(n / 10) * (n % 10);
    }
}
