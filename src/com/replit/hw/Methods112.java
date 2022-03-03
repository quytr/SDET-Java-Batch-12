package com.replit.hw;

public class Methods112 {
    /*
Create a method in which you will be printing numbers from 1 to 10

Call the method in the main method
     */

    void printNumber(){
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Methods112 obj = new Methods112();
        obj.printNumber();
    }
}
