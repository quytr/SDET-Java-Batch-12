package com.replit.hw;

public class Encapsulation179 {
    /*
 Create Class EncapsulationDemo that will have 2 variables empName and empAge; Create the getter/setter methods for each variable.

In Main Class and main method

Using setter methods assign the values as "Mario" and "32"

Using getter methods print the values as below outputs.

Expected Output:

Employee Name: Mario
Employee Age: 32
     */
}
class EncapsulationDemo1{
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
class Main25{
    public static void main(String[] args) {
        EncapsulationDemo1 encapsulationDemo1 = new EncapsulationDemo1();
        encapsulationDemo1.setEmpName("Mario");
        encapsulationDemo1.setEmpAge(32);
        System.out.println("Employee Name: " + encapsulationDemo1.getEmpName());
        System.out.println("Employee Age: " + encapsulationDemo1.getEmpAge());
    }
}
