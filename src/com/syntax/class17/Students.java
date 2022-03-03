package com.syntax.class17;

public class Students {

    String studentName;
    String studentID;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students student1 = new Students();

        student1.studentName = "Ema";
        student1.studentID = "12345";
        Students.numberOfStudents++;

        Students student2 = new Students();

        student2.studentName = "Tim";
        student2.studentID = "123";
        Students.numberOfStudents++;

        Students student3 = new Students();

        student3.studentName = "Chris";
        student3.studentID = "1234";
        Students.numberOfStudents++;

        System.out.println("Total of students = " + Students.numberOfStudents);

    }
}
