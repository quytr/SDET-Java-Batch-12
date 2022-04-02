package com.syntax.class28;

import java.util.HashSet;

public class HW6 {
    /*
    Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order. Each student object should have name and studentID.
    Display name of each student.
     */
    public static void main(String[] args) {
        HashSet<Students> students = new HashSet<>();
        students.add(new Students("Kevin", "KA12354"));
        students.add(new Students("Tracy", "TP95452"));
        students.add(new Students("Jun", "JT34234"));


        for(Students student : students){
            student.studentInfo();
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
    public void studentInfo(){

        System.out.println(studentName);
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }
}