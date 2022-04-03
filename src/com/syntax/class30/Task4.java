package com.syntax.class30;

import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    /*
    Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.
    In Test Class create a Map that will store key in ascending order.
    In that map store personId and a Person Object. Print each object details.
     */

}
class Person{
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
class Tester{
    public static void main(String[] args) {
        TreeMap<String, Person> personTreeMap = new TreeMap<>();
        personTreeMap.put("a1223", new Person("Katie", "Perry", 25,150000));
        personTreeMap.put("b1423", new Person("Venus", "Scrar", 20,100000));
        personTreeMap.put("c1523", new Person("Sora", "Sakura", 18,50000));
        personTreeMap.put("d1623", new Person("Adam", "Holland", 28,250000));

        for(Map.Entry<String, Person> p : personTreeMap.entrySet()){
            System.out.println(p);
        }
    }
}
