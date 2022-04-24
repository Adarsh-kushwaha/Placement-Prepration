package Oops.Access;

public class Main {
    private int n;
    protected int m;

    // TO ACCESS PRIVATE IN OTHER CLASS WE WILL USE GETTER AND SETTER
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Main(int n, int m) {
        this.n = n;
        this.m = m;
    }
}
