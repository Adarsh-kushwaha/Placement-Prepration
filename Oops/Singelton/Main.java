package Oops.Singelton;

public class Main {
    public static void main(String[] args) {
        // both will refer to the same object
        Singelton obj1 = Singelton.getInstance();
        Singelton obj2 = Singelton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
