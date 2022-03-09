package com.syntax.class21;

public class ClassA {
    void method(){
        System.out.println("method from A");
    }
}
class ClassB extends ClassA{
    @Override
    void method() {
        System.out.println("method from B");
    }
    void test(){
        method();
        this.method();
        super.method();
    }
}
class Tester{
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.test();

    }
}
