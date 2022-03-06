package com.syntax.class19;

public class Task1 {

    int num1,num2,num3;

    public Task1(){
        System.out.println("This is a public constructor");
    }

    private Task1(int num1){
        System.out.println("This is a private constructor");
    }

    Task1(int num1, int num2){
        System.out.println("This is a default constructor");
    }

    protected Task1(int num1, int num2, int num3){
        System.out.println("This is a protected constructor");
    }

    public static void main(String[] args) {
        new Task1();
        new Task1(5);
        new Task1(5,6);
        new Task1(4,7,8);

    }
}
