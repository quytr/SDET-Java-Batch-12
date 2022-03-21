package com.replit.hw;

public interface Interface174 {
    /*
Create an Interface with name as MyInterface

Create two undefined methods method1 and method2

Inherit the MyInterface to Main Class.

Execute both methods

Expected Output:

implementation of method1
implementation of method1
implementation of method2
     */
}
interface MyInterface{
    void method1();
    void method2();

}
class Main20 implements MyInterface{
    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {
        Main20 main20 = new Main20();
        main20.method1();
        main20.method2();
    }
}

