package Oops.Ploymorphism.Overloading;

// Overloading Methods:
// In Java, it is possible to define two or more methods within the same class that share the same name,
// as long as their parameter declarations are different.
// While overloaded methods may have different return types, the return type alone is insufficient to distinguish two
// versions of a method. When Java encounters a call to an overloaded method, it simply executes the version of the method
// whose parameters match the arguments used in the call.
// In some cases, Java’s automatic type conversions can play a role in overload resolution.

public class Main extends Box {
    public Main(int a) {
        super(a);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // Box box = new Box();
        // box.weigh(5);
        // box.weigh();

            Box box1 = new Box(5);
            Box box2;
            box2 = box1.incByTen();
            System.out.println(box1.n);
            System.out.println(box2.n);

    }
}
