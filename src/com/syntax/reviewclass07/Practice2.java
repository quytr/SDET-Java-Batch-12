package com.syntax.reviewclass07;

public class Practice2 {

    String getRecord(){
        String department = "QA";
        String empName = "Violet";
        String details = "Worker " + empName + " belongs to " + department;
        return details;
    }

    public static void main(String[] args) {
        Practice2 obj = new Practice2();
        System.out.println(obj.getRecord());
    }
}
