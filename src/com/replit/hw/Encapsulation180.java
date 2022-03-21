package com.replit.hw;

public class Encapsulation180 {
    /*
    Create Class EncapsulationDemo

create two variable as shown below.

private String empName=John;

private int empAge=30;

Create only getters methods for each variable.

Print the values of each variable as shown below.

Expected Output:

Employee Name: John
Employee Name: John
Employee Age: 30
     */
}
class EncapsulationDemo2{
    private String empName ="John";
    private int empAge = 30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
}
class Main26{
    public static void main(String[] args) {
        EncapsulationDemo2 encapsulationDemo2 = new EncapsulationDemo2();
        System.out.println("Employee Name: " + encapsulationDemo2.getEmpName());
        System.out.println("Employee Age: " + encapsulationDemo2.getEmpAge());
    }
}