package com.syntax.class30;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class HW5 {
    /*
    Create a Map that will store Employee name and salary. Write a logic to retrieve
    an employee who gets the highest salary. Output should be in the below format
John Smith=$100000
     */

    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<>();
        employees.put("David D", 85000);
        employees.put("John Smith", 100000);
        employees.put("Andy S", 65000);
        employees.put("Kevin Heart", 90000);
        employees.put("Tim Kane", 80000);
        employees.put("Kelly N", 70000);
        System.out.println(employees);

        int highestSalary = (Collections.max(employees.values()));
        for(Map.Entry<String, Integer> entry : employees.entrySet()){
            if(entry.getValue() == highestSalary){
                System.out.println(entry);
            }
        }
    }
}
