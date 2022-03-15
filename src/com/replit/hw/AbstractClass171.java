package com.replit.hw;

public class AbstractClass171 {
    /*
 Create a Parent Class that will have two overloaded abstract methods m1

Make Main class as concrete subclass to Parent Class

In main method call the methods.

Expected Output:

m1 without parameters
m1 method with parameter
     */
}
abstract class Parent17{
    abstract void m1();
    abstract void m1(int a);
}
class Main17A extends Parent17{
    void m1(){
        System.out.println("m1 without parameters");
    }
    void m1(int a){
        System.out.println("m1 method with parameter");
    }

    public static void main(String[] args) {
        Main17A obj = new Main17A();
        obj.m1();
        obj.m1(2);
    }
}
