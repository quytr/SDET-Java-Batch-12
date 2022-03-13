package com.replit.hw;

public class Inheritance150 {
    /*
Create four classes (Person, Employee, Student, Retiree)
Have properties
For Person: name(String)

For Person: lastName(String)

For Person: age(int)

For Employee: salary(int)

For Student: grade(int)

For Retiree: seniorActivity(String)

At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

Create multilevel inheritance: Person --> Employee --> Student --> Retiree

From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

Expected Output:

Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
     */
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("Joe", "Smith", 35);
        employee1.print(35000);
        Student student = new Student("Adam", "Smith", 15);
        student.print(10);
        Retiree retiree = new Retiree("Frank", "Smith", 15);
        retiree.print("tour");
    }


}

class Person{
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
class Employee1 extends Person{
    int salary;

    public Employee1(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    void print(int salary){
        this.salary = salary;
        System.out.println(name + " " + lastName + " " + age + " " + this.salary);
    }
}
class Student extends Employee1{
    int grade;

    public Student(String name, String lastName, int age) {
        super(name, lastName, age);
    }


    void print(int grade){
        this.grade = grade;
        System.out.println(name + " " + lastName + " " + age + " " + this.grade);
    }
}
class Retiree extends Student{
    String seniorActivity;

    public Retiree(String name, String lastName, int age) {
        super(name, lastName, age);
    }


    void print(String seniorActivity){
        this.seniorActivity = seniorActivity;
        System.out.println(name + " " + lastName + " " + age + " " + this.seniorActivity);
    }
}
