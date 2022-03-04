package com.syntax.reviewclass07;

public class Practice5 {

    String weekDay(String day){
        switch (day.toLowerCase()){
            case "monday":
                return "it is lazy day";
            case "tuesday":
                return "it is productive day";
            case "wednesday":
                return "it is gloomy day";
            case "thursday":
                return "it is exciting day";
            case "friday":
                return "no work day";
            default:
                return "no correct option found";
        }
    }

    public static void main(String[] args) {
        Practice5 obj = new Practice5();
        System.out.println(obj.weekDay("thursday"));
    }
}
