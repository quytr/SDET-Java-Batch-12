package com.replit.hw;

public class MethodOverloading162 {
    /*
 Overload static method and then execute both overloaded methods.

Expected Output:

static method without parameter
static method with int parameter
     */
}
class Main13{
    static void print(){
        System.out.println("static method without parameter");
    }
    static void print(int a){
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        new Main13().print();
        new Main13().print(3);
    }
}
