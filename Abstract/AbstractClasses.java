package Abstract;

//parent class

public abstract class AbstractClasses {

    public AbstractClasses() {
        super();
    }

    // cannot create abstract contructor
    // abstract void AbstractClasses();

    abstract void Parent();

    // you cannot create static abstract methosd because you cannot override static
    // method

    // But we can crearte static method in abstract classes

    static void mother() {
        System.out.println("I am mother");
    }

}

// child class

class Son extends AbstractClasses {

    @Override
    void Parent() {
        System.out.println("Programmer");

    }

}