package com.syntax.reviewclass13;

import java.util.ArrayList;

public class LambdaExpressions {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("orsan");
        names.add("nassir");
        names.add("mujeeb");
        names.add("tolga");
        long m = names.parallelStream().filter(x->x.contains("m")).count();
        System.out.println(m);
    }

}
