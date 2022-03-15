package com.replit.hw;

public class MethodOverriding163 {
    /*
In Parent Class create a method with name method() that will print "Parent method"

Override method() in Child class that will print "Child method"

In Main Class create objects of child and parent class and call its method.

Expected Output:

Parent method
Child method
     */
}
class Parent14{
    void method(){
        System.out.println("Parent method");
    }
}
class Child14 extends Parent14{
    @Override
    void method() {
        System.out.println("Child method");
    }
}
class Main15{
    public static void main(String[] args) {
        Parent14 parent14 = new Parent14();
        parent14.method();
        Parent14 child = new Child14();
        child.method();
    }
}

