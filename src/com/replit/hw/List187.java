package com.replit.hw;

import java.util.ArrayList;

public class List187 {
    /*
    Create an array list to type String.

Add these values below to your arraylist

hi

yo

sup

yolo

boop

Remove 1, 3, 5 element from an array

print remained values one by one in one line

Expected Output:

yo yolo
     */
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("hi");
        str.add("yo");
        str.add("sup");
        str.add("yolo");
        str.add("boop");
        str.remove(0);
        str.remove(1);
        str.remove(2);

        for(String s : str){
            System.out.print(s + " ");
        }


    }
}
