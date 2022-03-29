package com.syntax.class28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Student taylor = new Student("Taylor", 20, "Memes");
        Student miley = new Student("Miley", 16, "Singer");
        Student selena = new Student("Selena", 18, "Study");

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(taylor);
        studentLinkedList.add(miley);
        studentLinkedList.add(selena);
        System.out.println(studentLinkedList);
    }
}
class Student{
    String name;
    int age;
    String hobbies;

    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}
