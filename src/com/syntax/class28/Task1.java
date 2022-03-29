package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.
     */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        System.out.println(cars);
        for(String car: cars){
            System.out.println(car);
        }

        for (int i = 0; i < cars.size() ; i++) {
            System.out.println(cars.get(i));
        }

        int i =0;
        while(i < cars.size()){
            System.out.println(cars.get(i));
            i++;
        }

        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
