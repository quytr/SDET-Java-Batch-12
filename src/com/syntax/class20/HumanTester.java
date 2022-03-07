package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Keith";
        System.out.println(student.name);
        student.printName();
        student.studentID = "12345";

        System.out.println("------------------------");

        Principle principle = new Principle();
        principle.name = "Bob";
        principle.printName();
        principle.specialParkingSlot = false;


    }
}
