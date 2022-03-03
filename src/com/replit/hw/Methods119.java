package com.replit.hw;

public class Methods119 {
    /*
Write a method header with the following specs:

Returns:
a String

Name:
censorLetter

Parameters:
a String

a char

Then complete the method by programming the following behavior

Replace all instances of given character with a "*" within the given String.

     */

    String censorLetter(String str, char chr){
        return str.replace(chr, '*');
    }

    public static void main(String[] args) {
        Methods119 obj = new Methods119();
        System.out.println(obj.censorLetter("computer science",'e'));
        System.out.println(obj.censorLetter("trick or treat",'t'));
    }
}
