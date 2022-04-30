package Abstract;

public class Main {
    public static void main(String[] args) {
        // AbstractClasses son1 = new Son();
        Son son1 = new Son();
        son1.Parent();

        // AbstractClasses obj = new AbstractClasses();
        // - cannot create the object of
        // abstract classes - because it contain abstract method and by creating object
        // you can call abstract method but abstract method does not have body do it
        // will give you error

        AbstractClasses.mother();

    }
}
