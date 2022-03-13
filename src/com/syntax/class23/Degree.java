package com.syntax.class23;

public class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree{

}
class Master extends Degree{
    @Override
    void getPrerequisite() {
        System.out.println("To get a Master you need Bachelors diploma");

    }
}
class DegreeTester{
    public static void main(String[] args) {
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
        Master master = new Master();
        master.getPrerequisite();
    }
}