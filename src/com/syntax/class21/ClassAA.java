package com.syntax.class21;

public class ClassAA {
    String name;
    int age;
    double weight;

    public ClassAA(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name + " " + age + " " + weight);
    }
}
class ClassBB extends ClassAA{
    public ClassBB(String name, int age, double weight) {
        super(name, age, weight);  // mostly this is how it will be used in the job
    }
}

class Test{
    public static void main(String[] args) {
        ClassBB classBB = new ClassBB("Kevin", 25,87);
        classBB.printInfo();
    }
}