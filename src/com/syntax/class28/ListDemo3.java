package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");
        courses.add("TestNG");

        for (int i = 0; i < courses.size() ; i++) {
            if(courses.get(i).equals("Java")){
                courses.set(i, "Happy");  //replace
           }
        }

//        courses.replaceAll(s -> {
//                if(s.equals("Java")){
//                    return "Happy";
//                }else{
//                    return s;
//                }
//            }
//        );

        System.out.println(courses);

    }
}
