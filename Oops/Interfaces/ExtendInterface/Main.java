package Oops.Interfaces.ExtendInterface;

public class Main implements B {


    // iN THIS CASE YOU HAVE TO OVERRIDE BOTH OF THE METHOD

    @Override
    public void fun() {
        // TODO Auto-generated method stub
        System.out.println("Have fun");
    }

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        System.out.println("hello!");
        
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greet();

        //calling static method from interface
        A.printSomething();
    }
    
}
