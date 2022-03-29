package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    /*
    Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 500 ; i+=2) {
                numbers.add(i);
        }
        System.out.println(numbers);

        numbers.removeIf(integer -> integer % 5 == 0); //Lambda
//        Iterator<Integer> iterator = numbers.iterator();
//        while(iterator.hasNext()){
//            if(iterator.next()%5==0){
//                iterator.remove();
//            }
//        }
        System.out.println(numbers);
    }
}
