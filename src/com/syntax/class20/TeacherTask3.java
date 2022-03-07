package com.syntax.class20;

public class TeacherTask3 {

    String name;
    String empID;
    String subject;
    int age;

    void teach(){
        System.out.println(name + " is teaching " + subject);
    }

    void grade(){
        System.out.println(name + " is grading the tests");
    }

}

class MathTeacher extends TeacherTask3{
    boolean canTeachTrigonometry = true;
    public static void main(String[] args) {
        MathTeacher teacher1 = new MathTeacher();
        teacher1.name = "Kevin";
        teacher1.subject = "Math";
        teacher1.teach();
        teacher1.grade();
    }
}

class ChemistryTeacher extends TeacherTask3{
    boolean canTeachChemicals = true;
    public static void main(String[] args) {
        ChemistryTeacher teacher2 = new ChemistryTeacher();
        teacher2.name = "Bobby";
        teacher2.subject = "Chemistry";
        teacher2.teach();
        teacher2.grade();
    }
}

class PianoTeacher extends TeacherTask3{
    boolean canPlayMusic = true;
    public static void main(String[] args) {
        PianoTeacher teacher3 = new PianoTeacher();
        teacher3.name = "Aggie";
        teacher3.subject = "Piano";
        teacher3.teach();
        teacher3.grade();
    }
}
