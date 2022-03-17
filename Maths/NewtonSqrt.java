package Maths;

public class NewtonSqrt {
    public static void main(String[] args) {
        
    }

    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            //using newton raphalson formula
            root = 0.5 * (x + (n/x));
            //checking the error if error id less than < 0.5 break the loop and print the ans
            if (Math.abs(root - x) < 0.5) {
                break;
            }
            // otherwise update the value of root and again run the loop
            x = root;
        }
        return root;
    }
}


//Time Comp = O((logn)f(n))