package com.syntax.class19;

public class Students {

    String name;
    double mathGrade;
    double engGrade;
    double chemGrade;

    void calculateAverageGrade() {
        System.out.println("The average grade of " + name + " is " + (mathGrade + engGrade + chemGrade) / 3);
    }


    Students(String name, double mathGrade, double engGrade, double chemGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.engGrade = engGrade;
        this.chemGrade = chemGrade;
    }
}
