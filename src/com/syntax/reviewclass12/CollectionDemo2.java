package com.syntax.reviewclass12;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionDemo2 {
    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");

        fruit.remove("Mango");
        System.out.println(fruit);

        ArrayList<Fruit> f = new ArrayList<>();
        f.add(new Fruit("Apple"));
        f.add(new Fruit("Orange"));
        f.add(new Fruit("Mango"));
        f.remove(new Fruit( "Mango"));
        System.out.println(f);


    }
}
class Fruit{
    String name;
    Fruit(String name){
        this.name = name;
    }

    // instead of checking the address of objects we check if the fruit name is same or not if it is same
    //we consider the object also the same
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}