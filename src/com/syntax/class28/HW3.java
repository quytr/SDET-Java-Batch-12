package com.syntax.class28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HW3 {
    /*
    How can you remove all duplicates from ArrayList?
List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
     */
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        HashSet<String> bList = new HashSet<>(aList);
        System.out.println(bList);
    }
}
