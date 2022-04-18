package com.syntax.class33;

public class Task4 {
    /*
    Create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters.
     */
    public static void checkUsername(String username){
        if(username.length() < 5){
            throw new RuntimeException("Your username is too short");
        }else{
            System.out.println("Your username is met the requirement length");
        }
    }

    public static void main(String[] args) {
        checkUsername("quytr");
        checkUsername("tim");
    }
}
