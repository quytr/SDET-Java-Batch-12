package com.replit.hw;

public class SuperKeyword157 {
    /*
Create a Parent class

create instance method m1 saying "m1 method in parent class"

Create a Child class that will be a derived class from Parent

Create same instance method m1 saying "m1 method in child class"

Create another method m2 in child class and inside that method call method m1 from child class and method m1 from parents class

in Main class.

Create and object of child class and call m2 method

Expected Output:

m1 method in child class
m1 method in child class
m1 method in parent class
     */
}
class Parent5{
    void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child5 extends Parent5{
    void m1(){
        System.out.println("m1 method in child class");
    }
    void m2(){
        m1();
        super.m1();
    }
}
class Main9{
    public static void main(String[] args) {
        new Child5().m2();
    }
}
