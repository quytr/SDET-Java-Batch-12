package com.syntax.reviewclass13;

import java.util.ArrayList;
import java.util.LinkedList;


public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<LinkedList<String>> complexData = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Med");
        linkedList.add("Dad");
        linkedList.add("Char");

        LinkedList<String> linkedList2= new LinkedList<>();
        linkedList2.add("Mom");
        linkedList2.add("Mr.D");
        linkedList2.add("Ema");

        complexData.add(linkedList);
        complexData.add(linkedList2);

        System.out.println(complexData);


    }
}
