package Oops.Interfaces.ExtendInterface;

public interface A {

    //static method requires body and should be define inside interface;
    //they can be called using the name of interface
    static void printSomething(){
        System.out.println("Hello from another side");
    }

    void fun();
}
