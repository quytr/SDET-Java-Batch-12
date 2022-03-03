package com.replit.hw;

public class StringManipulations098 {
    /*
    Create a String given="Hello Syntax friends".

    Using String methods from given String create new String "Welcome Syntax family"

    Expected Output:

    Welcome Syntax family
     */

    public static void main(String[] args) {

        String given = "Hello Syntax friends";
        System.out.println(given.replace("Hello", "Welcome").replace("friends", "family"));
    }
}
