package Recursion;

//basic example how recursion work

public class Number {
    public static void main(String[] args) {
        print(1);
    }

    // static void print1(int n){
    // System.out.println(n);
    // print2(2);
    // }

    // static void print2(int n){
    // System.out.println(n);
    // print3(3);
    // }

    // static void print3(int n){
    // System.out.println(n);
    // print4(4);
    // }

    // static void print4(int n){
    // System.out.println(n);
    // print5(5);
    // }

    // static void print5(int n){
    // System.out.println(n);
    // }

    // but this thing is not a good idea to do so for that we will use concept of
    // recursion i.e fuction calling itself

    static void print(int n) {

        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n + 1);

    }

}
