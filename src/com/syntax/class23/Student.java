package com.syntax.class23;

public class Student {
    void activity() {
        System.out.println("You can join as many activities as you can");
    }
    void subject() {
        System.out.println("You can take up to 10 classes");
    }
}
class SyntaxStudent extends Student {
    void activity() {
        System.out.println("No time to join any activity");
    }
    void subject() {
        System.out.println("You must take Java Class");
    }
    void rest() {
        System.out.println("No time to rest for the next 6 months");
    }
}
class CollegeStudent extends Student {
    void activity() {
        System.out.println("You only have time to join one club");
    }
    void subject() {
        System.out.println("You can take up to 6 classes");
    }
    void party() {
        System.out.println("You can party every weekend");
    }
}
class SchoolStudent extends Student {
    void activity() {
        System.out.println("You can join two clubs");
    }
    void subject() {
        System.out.println("You can take up to 8 classes");
    }
    void study() {
        System.out.println("You need to spend more hours to study to get to college");
    }
}
class Main {
    public static void main(String[] args) {
        new SchoolStudent().activity();
        new SchoolStudent().study();

        new CollegeStudent().activity();
        new CollegeStudent().subject();

        new SyntaxStudent().activity();
        new SyntaxStudent().rest();

    }
}
