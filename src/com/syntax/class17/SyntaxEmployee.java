package com.syntax.class17;

public class SyntaxEmployee {

    String empId;
    double salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee aselObj = new SyntaxEmployee();
        aselObj.empId = "123";
        aselObj.salary = 200000;
        System.out.println(aselObj.empId);
        System.out.println(aselObj.salary);
        System.out.println(SyntaxEmployee.CEO);

    }
}
