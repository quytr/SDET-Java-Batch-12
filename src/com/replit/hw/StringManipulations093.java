package com.replit.hw;

public class StringManipulations093 {

    /*
    For you to do: String “abracadabra alakazam”;

    Print out the position of the first occurrence of "c".
    Print out the position of the first occurrence of " ".
    Print out the position of the first occurrence of the variable target1.
    Print out the position of the first occurrence of the variable target2.
     */

    public static void main(String[] args) {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target2));
    }
}
