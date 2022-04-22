package Oops.Inheritance;

public class Box {
    int l;
    int b;
    int h;

    public Box(int l, int b, int h) {
        this.l = l;
        this.h = h;
        this.b = b;
    }

    public Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.b = old.b;
    }
}
