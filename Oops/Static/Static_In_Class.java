package Oops.Static;

import javax.print.DocFlavor.STRING;

public class Static_In_Class {

    // static is important if you want to access this class in psvm function - this
    // simply mean you do not need to create object of outer class if you want to
    // access inner class.

    static class Test {
        static String name;
        String lastName;

        public Test(String name, String lastName) {
            Test.name = name;
            this.lastName = lastName;
        }
    }

    public static void main(String[] args) {
        // Test name1 = new Test("adarsh");
        // Test name2 = new Test("ajay");

        // this will not print differnt name because we are making static to class not
        // to Name

        // System.out.println(name1.name);
        // System.out.println(name2.name);

        Test name1 = new Test("ajay", "singh");
        Test name2 = new Test("atul", "kumar");

        System.out.println(Test.name + "-" + name1.lastName);
        System.out.println(Test.name + "-" + name2.lastName);
        
       
    }
}
