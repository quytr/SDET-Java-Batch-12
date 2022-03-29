package com.syntax.class28;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {

        TreeSet<String> fruit = new TreeSet<>();
        fruit.add("z");
        fruit.add("a");
        fruit.add("d");
        fruit.add("b");
        fruit.add("z");
        fruit.add("p");
        System.out.println(fruit);
    }
}
