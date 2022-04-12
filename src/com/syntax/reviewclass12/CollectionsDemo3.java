package com.syntax.reviewclass12;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo3 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("E");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("B");

        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Medina"));

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        char[] arr = "Maha".toCharArray();
        System.out.println(arr[0]);

        System.out.println(Character.isAlphabetic('6'));
        System.out.println(Character.isAlphabetic('D'));

        char c = ']';
            System.out.println(Character.isAlphabetic(c));
            System.out.println(Character.isDigit(c));
            System.out.println(Character.isLetter(c));

    }
}
