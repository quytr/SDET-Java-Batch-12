package com.syntax.class20;

public class Task2A {

    static void printF(){
        System.out.println("This is the base class");
    }
}

class Task2B extends Task2A{
    public static void main(String[] args) {
        printF();
    }
}
