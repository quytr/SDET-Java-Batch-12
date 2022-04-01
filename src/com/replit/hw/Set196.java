package com.replit.hw;

import java.util.HashSet;

public class Set196 {
    /*
    Create a Set and and below values to it.

[third, first, second]

Print HashSet and then remove all the elements from Hashset and print it again.

Expected Output:

[third, first, second]
[]
     */
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();
        str.add("third");
        str.add("first");
        str.add("second");
        System.out.println(str);
        str.removeAll(str);
        System.out.println(str);


    }
}
