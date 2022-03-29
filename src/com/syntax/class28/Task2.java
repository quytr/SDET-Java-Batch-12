package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    /*
    Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Love");
        words.add("Hello");
        words.add("Java");
        words.add("Stone");
        words.add("code");
        System.out.println(words);

//        words.removeIf(s -> s.toLowerCase().endsWith("e"));  //Lambda
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            if(iterator.next().toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);


    }
}
