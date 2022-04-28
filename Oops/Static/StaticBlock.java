package Oops.Static;


public class StaticBlock {
    static int a = 4;
    static int b;

    public StaticBlock() {
    }

    // when java file is loaded at first all static variables are declared and
    // static block only run once when first object is created;
    static {
        System.out.println("inside static block");
       
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock s1 = new StaticBlock();
        System.out.println(b + "," + a);
        StaticBlock.a += 6;
        System.out.println(b + "," + a);
        StaticBlock s2 = new StaticBlock();
        System.out.println(b + "," + a);

    }
}
