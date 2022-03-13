package com.syntax.class24;

public class ToStringDemo {
    String name;
    int age;

    public ToStringDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mr.A please show us your handsome face";
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo("Kelly", 10);
        System.out.println(toStringDemo.toString());

    }

}
