package com.syntax.reviewclass07;

public class Practice3 {

    String studentName;
    String course;
    int studentsID;
    int grades;

    void displayStudentsRecord(){
        System.out.println("The student name is " + studentName + " and the course student enrolled for is " + course);
        System.out.println("THe student ID is " + studentsID + " and the grades student achieved are " + grades);

    }

    public static void main(String[] args) {

        Practice3 p1 = new Practice3();
        p1.studentName = "Rogo";
        p1.course = "SDET";
        p1.studentsID = 123;
        p1.grades = 65;
        p1.displayStudentsRecord();

        System.out.println("-------------------------------------------------------------------------------------");

        Practice3 p2 = new Practice3();
        p2.studentName = "Kevin";
        p2.course = "Science";
        p2.studentsID = 456;
        p2.grades =85;
        p2.displayStudentsRecord();

    }


}
