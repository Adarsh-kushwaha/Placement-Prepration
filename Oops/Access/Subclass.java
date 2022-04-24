package Oops.Access;

public class Subclass extends Main {
    public Subclass(int n, int m) {
        super(n, m);
        
    }

    public static void main(String[] args) {
        Main obj = new Main(5,6);

        // System.out.println(obj.n);
        System.out.println(obj.getN());

        int  k = obj.m; // protected hain to subclass me acces kar sakte hai

    }
}
