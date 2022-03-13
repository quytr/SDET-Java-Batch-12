package com.replit.hw;

public class ThisKeyword146 {
    /*
Complete the Employee.java class:
Include the following class variables:

name(String)

lastName(String)

employeeId(int)

startDate(String)

salary(int)

Write two constructors:

non-argument constructor

parameterized constructor that will initialize all instance variables

Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
     */
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.printAll();
        Employee employee1 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
        employee1.printAll();

    }

}
class Employee{
    String name;
    String lastName;
    int employeeID;
    String startDate;
    int salary;

    public Employee(){

    }

    public Employee(String name, String lastName, int employeeID, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    }
    void printAll(){
        System.out.println(name + " " + lastName + " " + employeeID+ " " + startDate + " " + salary);
    }
}
