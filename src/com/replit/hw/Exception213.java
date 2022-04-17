package com.replit.hw;



public class Exception213 {
    /*
    Create a method that will do temperature check. Anytime user passes temperture that is below 32 method should throw an Exception saying "It is freezing"

In Main method call the method and handle an Exception

Expected Output:

java.lang.RuntimeException: It is freezing
     */

    public static void temperatureCheck(int temperature){
        if(temperature<32){
            System.out.println(new RuntimeException("It is freezing"));
        }
    }


    public static void main(String[] args) {

        temperatureCheck(30);
    }
}

