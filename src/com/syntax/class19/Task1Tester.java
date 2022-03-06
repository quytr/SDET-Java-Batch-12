package com.syntax.class19;

public class Task1Tester {

    public static void main(String[] args) {
        new Task1();
//        new Task1(5);  //can't access the private constructor in the same package, but different class
        new Task1(5,8);
        new Task1(5,8,9);
    }
}
