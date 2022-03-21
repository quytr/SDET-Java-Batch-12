package com.group.project2;

public class CodingTask2 {
    /*
We have to calculate the average of marks obtained
in three subjects by student A and by student B.
Create   class   'Marks'   with   an   abstract   method
'getPercentage' that will be returning the average
percentage   of   marks.   Provide   implementation   of
abstract   method   in   classes   'A'   and   'B'.   The
constructor of student A takes the marks in three
subjects as its parameters and the marks in four
subjects as its parameters for student B. Test your
code
     */
}
abstract class Marks{
    abstract double getPercentage();
}
class StudentA extends Marks{
    double mathScore;
    double scienceScore;
    double englishScore;

    public StudentA(double mathScore, double scienceScore, double englishScore) {
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }

    @Override
    double getPercentage() {
        return (mathScore + englishScore + scienceScore)/3;
    }
}
class StudentB extends Marks{
    double mathScore;
    double englishScore;
    double chemistryScore;
    double historyScore;

    public StudentB(double mathScore, double englishScore, double chemistryScore, double historyScore) {
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.chemistryScore = chemistryScore;
        this.historyScore = historyScore;
    }

    @Override
    double getPercentage() {
        return (mathScore + englishScore + chemistryScore + historyScore)/4;
    }
}
class MarksTester{
    public static void main(String[] args) {
        System.out.println("The average percentage of student A is " +  new StudentA(89,70,99).getPercentage());

        System.out.println("The average percentage of student B is " + new StudentB(100, 56,87,70).getPercentage());

    }
}
