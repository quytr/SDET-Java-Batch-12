package com.syntax.class16;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringDemo2 {

    public static void main(String[] args) {
        String str ="1234562$^#$#*%^^&%ksdfkjfdJKHBJHK";
        System.out.println(str.replaceAll("[0-4]","Q"));
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[A-Z]",""));
        System.out.println(str.replaceAll("[!-/]",""));
        System.out.println(str.replaceAll("[a-z, A-Z]",""));
        System.out.println(str.replaceAll("[a-zA-Z0-9]",""));
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));


    }
}
