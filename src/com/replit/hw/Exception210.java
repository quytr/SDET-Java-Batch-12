package com.replit.hw;

public class Exception210 {
    /*
    Complete the code, handle possible exception

Expected Output:

/ by zero
     */
    public static void main(String[] args) {
        try{
            int a=10, b=0, result;

            result = a/b;
        }catch (ArithmeticException are){
            System.out.println(are.getMessage());
        }

    }
}
