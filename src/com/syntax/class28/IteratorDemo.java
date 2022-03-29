package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");

        //when the size of the list changes, using for loop might not work.

//        for (int i = 0; i < courses.size(); i++) {
//            if(courses.get(i).equals("Java")){
//                courses.remove("Java");
//            }
//        }
//        for(String course: courses){
//            if(course.equals("Java")){
//                courses.remove(course);
//            }
//        }  //for loop is not dynamic

    }
}
