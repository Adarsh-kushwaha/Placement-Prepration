package Oops.Interfaces.NestedInterface;

public class B implements A.NestedInterface {

    @Override
    public void isEven(int num) {
        // TODO Auto-generated method stub
        if (num % 2 == 0) {
            System.out.println("Is even");
        } else {
            System.out.println("is odd");
        }

    }
}
