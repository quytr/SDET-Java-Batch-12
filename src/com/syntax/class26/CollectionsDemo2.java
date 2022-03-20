package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("Gana");
        countries.add("Vietnam");
        countries.add("Thailand");

        System.out.println(countries.get(3));
//        System.out.println(countries.get(-1));  //out of bound
//        System.out.println(countries.get(10));  //out of bound
        System.out.println(countries);

        countries.add(3,"Japan");  // insert the elements at this specified index
        System.out.println(countries);

        System.out.println(countries.size());

        countries.remove("Iraq");
        System.out.println(countries);

        countries.clear();
        System.out.println(countries);
        System.out.println(countries.size());

    }
}
