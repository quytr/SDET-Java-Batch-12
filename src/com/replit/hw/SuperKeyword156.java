package com.replit.hw;

public class SuperKeyword156 {
    /*
Create class A

declare variable int i=10;

Create class B extends A

declare variable int i=20;

create a method to display value of variable i from both classes

In Main Class create an object of subclass and call method display
     */
}

class AAA {
    int i = 10;
}

class BBB extends AAA {
    int i = 20;

    void print() {
        System.out.println(i);
        System.out.println(super.i);
    }
}
class Main8{
    public static void main(String[] args) {
        BBB bbb = new BBB();
        bbb.print();
    }
}
