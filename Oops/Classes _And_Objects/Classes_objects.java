package Oops.Classes_And_Objects;

public class Classes_objects {
    public static void main(String[] args) {
        Student student1 = new Student("Adarsh", 12, 78.0f);
        System.out.println(student1.marks);
    }
}

class Student {
    String name;
    int standard;
    float marks;

    // --calling constructor from inside constructor

    // public Student() {
    // this("ajay", 14, 40.2f);
    // }

    public Student(String name, int standard, float marks) {
        this.name = name;
        this.standard = standard;
        this.marks = marks;
    }
}