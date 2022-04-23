package Oops.Ploymorphism.Overloading;

public class Box {
    // double w;

    // public void weigh(double w) {
    // this.w = w;
    // // System.out.println(w);
    // }

    // public void weigh() {
    // // System.out.println("i am the box");
    // }

    int n;

    public Box(int a) {
        n = a;
    }

    public Box incByTen() {
        Box boxy = new Box(n + 10);
        return boxy;

    }

}
