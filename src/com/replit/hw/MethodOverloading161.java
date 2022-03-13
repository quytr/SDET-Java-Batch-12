package com.replit.hw;

public class MethodOverloading161 {
    /*
Overload private instance method m1

Call each method from the main method.

Expected Output:

private m1 method
private m1 method with int parameter
     */
}
class Main12{
    private void m1(){
        System.out.println("private m1 method");
    }
    private void m1(int a){
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {
        new Main12().m1();
        new Main12().m1(6);
    }
}
