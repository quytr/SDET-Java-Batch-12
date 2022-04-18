package com.syntax.class33;

public class Task3 {
    /*
    Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception age is less than 16.
     */
    public static void checkAge(int age){

            if(age < 16){
                throw new RuntimeException("You are not eligibility");
            }else{
                System.out.println("You are eligibility");
            }

    }

    public static void main(String[] args) {
        checkAge(18);
        checkAge(15);
    }
}
