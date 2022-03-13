package com.replit.hw;

public class Inheritance149 {
 /*
Create Three classes (Main, A, B):
Have a method that prints out the following

For A: "Class A"

For B: "Class B"

Make B extend A

From your Main class create an object of the B class and call the methods.

Output:

Class A
Class A
Class B
  */
 public static void main(String[] args) {
     B b = new B();
     b.print();
 }
}
class A{
    void print(){
        System.out.println("Class A");
    }
}
class B extends A{
    @Override
    void print() {
        super.print();
        System.out.println("Class B");
    }
}
