package com.replit.hw;

import java.util.ArrayList;

public class List183 {
    /*
    Create an array list that will hold String Objects

Find out wether array list is empty or not.

Add String value "Syntax" to it

Find out wether array list is empty or not.

Expected Output:

true
false
     */

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        System.out.println(str.isEmpty());
        str.add("Syntax");
        System.out.println(str.isEmpty());
    }
}
