package com.syntax.class28;

import java.util.HashSet;

public class HW6 {
    /*
    Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order. Each student object should have name and studentID.
    Display name of each student.
     */
    public static void main(String[] args) {
        Students students1 = new Students("Kevin", "KA12354");
        Students students2 = new Students("Tracy", "TP95452");
        Students students3 = new Students("Jun", "JT34234");

        HashSet<String> students = new HashSet<>();
        students.add(students1.studentInfo());
        students.add(students2.studentInfo());
        students.add(students3.studentInfo());

        for(String student : students){
            System.out.println(student);
        }

    }
}
class Students{
    String studentName;
    String studentID;

    public Students(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }
    public String studentInfo(){
        return (studentName + " " + studentID);
    }
}