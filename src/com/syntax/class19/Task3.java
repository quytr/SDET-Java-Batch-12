package com.syntax.class19;

public class Task3 {

    String name;
    String address;

    public Task3(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo(){
        System.out.println("Student's name is "+ name + " and the address is " + address);
    }
}
