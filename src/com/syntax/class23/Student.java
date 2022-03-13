package com.syntax.class23;

public class Student {
    void activity() {
        System.out.println("You can join as many activities as you can");
    }
    void subject() {
        System.out.println("You can take up to 10 classes");
    }
}
class SyntaxStudent extends Student {
    void activity() {
        System.out.println("No time to join any activity");
    }
    void subject() {
        System.out.println("You must take Java Class");
    }
    void rest() {
        System.out.println("No time to rest for the next 6 months");
    }
}
class CollegeStudent extends Student {
    void activity() {
        System.out.println("You only have time to join one club");
    }
    void subject() {
        System.out.println("You can take up to 6 classes");
    }
    void party() {
        System.out.println("You can party every weekend");
    }
}
class SchoolStudent extends Student {
    void activity() {
        System.out.println("You can join two clubs");
    }
    void subject() {
        System.out.println("You can take up to 8 classes");
    }
    void study() {
        System.out.println("You need to spend more hours to study to get to college");
    }
}
class Main {
    public static void main(String[] args) {
        //in Java we can store the object of a child classes in a parent type variable.
        // Every class in Java can be treated as data type;

        /*
        As we can store the object of a child class in a parent class, we can also create an array of
        these studetns as show below
         */
        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};
        for(Student student : students){
            //calling the methods from all the children classes
            student.activity();
            student.subject();
        }
        students[0].activity();

    }
}
