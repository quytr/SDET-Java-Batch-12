package com.replit.hw;

public class VariablesInJava122 {
    /*
Declare 3 instance variables to hold:

name of the country
capital
population size
Create a method to display values of instance variables

Create 2 Object, assign values to instance variables, execute method display;
     */

    String countryName;
    String capital;
    int population;

    void printAll(){
        System.out.println("The capital of " + countryName + " is " + capital + " and population is " + population);
    }

    public static void main(String[] args) {
        VariablesInJava122 obj1 = new VariablesInJava122();
        obj1.countryName = "USA";
        obj1.capital = "Washington DC";
        obj1.population = 330000000;
        obj1.printAll();

        VariablesInJava122 obj2 = new VariablesInJava122();
        obj2.countryName = "Kazakhstan";
        obj2.capital = "Astana";
        obj2.population = 18500000;
        obj2.printAll();
    }

}
