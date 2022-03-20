package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name = "Kebin";
        String name2 = "Kelly";
        //Not scalable if we have to store large amount of data
        //Arrays can be good option to tackle this problem

        String[] names = {"Andree", "Kate"};   //fixed size
//        names[2] = "Karik";
        String[] names2 = new String[1000];
        names2[0] = "Selena";
        names2[2] = "Miley";
        System.out.println(Arrays.toString(names2));

        ArrayList<String> syntaxStudents = new ArrayList<>();
        //ArrayList<String> => Name of the class
        //<> diamond operator
        //String datatype
        syntaxStudents.add("Demi");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Wowy");
        System.out.println(syntaxStudents);
    }
}

