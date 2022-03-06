package com.syntax.class19;

public class StudentsTester {

    public static void main(String[] args) {
        Students s1 = new Students("Matt", 80, 78, 99);
        new Students("Kevin", 88, 78, 99).calculateAverageGrade();
        new Students("Tom", 58, 68, 89).calculateAverageGrade();
        new Students("Bod", 95, 100, 89).calculateAverageGrade();
        new Students("Dave", 83, 48, 59).calculateAverageGrade();

        s1.calculateAverageGrade();



    }
}
