package com.replit.hw;

public class Exception214 {
    /*
    Create a custom Exception class

In main class create a method that will check students grade

if students grade is >90 then below exception should be thrown

if students grade is below 90 print "You are a great student"

In main method calls method gradeCheck and handle an Exception

Expected Output:

SyntaxStudentException: You are an exceptionally awesome student
     */
    public static void studentGrade(int grade){
        if(grade > 90){
            System.out.println(new SyntaxStudentException("You are an exceptionally awesome student"));
        }else{
            System.out.println(new SyntaxStudentException("You are a great student"));
        }
    }

    public static void main(String[] args) {
        studentGrade(92);

    }
}
class SyntaxStudentException extends RuntimeException{
    SyntaxStudentException(String errorMsg){
        super(errorMsg);
    }
}
