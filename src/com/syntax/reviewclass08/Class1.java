package com.syntax.reviewclass08;

public class Class1 {

    public void printSmallerDigit(int x, int y){
        if(x < y){
            System.out.println(x + " is smaller one");
        }else if(y < x){
            System.out.println(y + " is smaller one");
        }else{
            System.out.println(x + " and " + y + " are equal");
        }
    }

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.printSmallerDigit(10,5);
        class1.printSmallerDigit(5,9);
    }
}
