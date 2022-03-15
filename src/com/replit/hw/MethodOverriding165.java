package com.replit.hw;

public class MethodOverriding165 {
    /*
Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".

Override methods in child class

In Main Class create object of the child class and see which methods are available
     */
}
class Parent16 {
    public void m1(){
        System.out.println("I am parent public method");
    }
    protected void m2(){
        System.out.println("I am parent protected method");
    }
    void m3(){
        System.out.println("I am parent default method");
    }
    private void m4(){
        System.out.println("I am parent private method");
    }
}
class Child16 extends Parent16{
    @Override
    public void m1() {
        System.out.println("I am a child public method");
    }

    @Override
    protected void m2() {
        System.out.println("I am a child protected method");
    }

    @Override
    void m3() {
        System.out.println("I am a child default method");
    }

}
class Main16a{
    public static void main(String[] args) {
        Parent16 obj = new Child16();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
