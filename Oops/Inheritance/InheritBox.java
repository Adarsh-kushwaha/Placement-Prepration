package Oops.Inheritance;

public class InheritBox extends Box {
    int w;

    public InheritBox(int l, int b, int h, int w) {
        super(l, b, h); // => This is used to call parent class constructor, used to initialsise values
                        // of parent class
        this.w = w;
    }

    // this is same as doing - Box box2 = new InheritBox(5,6,7,20);
    public InheritBox(InheritBox other) {
        super(other);
        this.w = other.w;
    }

    public static void main(String[] args) {

        // InheritBox box1 = new InheritBox(5, 6, 8, 50);
        // System.out.println(box1.w);

        // object of type child calling the constructor of parent
        // Box box2 = new InheritBox(5,6,7,20);
        // System.out.println(box2.w);// this will throw error because our refernece
        // (box) doesnot have variable "w" in it

        // object type of parent class calling the constructor of child;
        // InheritBox box3 = new Box(8, 5,7); // this will throw error;
        // Reason for error - because object is type of parent class then how will you
        // can call constructor of child class
        // imp*** - you can go down to up but not up to down;

    }

}
