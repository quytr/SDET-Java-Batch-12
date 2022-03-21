package com.replit.hw;

public class Encapsulation182 {
    /*
 Create the a Person class with the following:

Class Variables

firstname
lastname
birthmonth
birthday
birthyear
String ssn
Constructor

The main constructor should take in all values and assign them to their respective private class variables

Methods

Create a public getters to access all the variables.

Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format. For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

in Main Class.

Instantiate and object of Person and provide values. follows below outputs for values.

using getter and method print them separately.

Note: Read carefully the steps.

Expected Output:

John
John
Doe
Doe
10/25/1900
10/25/1900
123-45-6789
     */
}
class Person1{
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String ssn;

    public Person1(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getSsn() {
        return ssn;
    }

    public String formatBirthday(){
        return getBirthMonth() +"/"+ getBirthDay()+"/"+getBirthYear();
    }
}
class Main28{
    public static void main(String[] args) {
        Person1 person1 = new Person1("John", "Doe", 10, 25, 1900, "123-45-6789");
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.formatBirthday());
        System.out.println(person1.getSsn());
    }
}
