package com.replit.hw;

public class AccessModifiers138 {
    /*
In AnotherClass declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.

All methods should be accessible by class name

Call methods of Another class inside Main class
     */
    private String str1(){
        return "private";
    }
    String str2(){
        return "default";
    }
    protected String str3(){
        return "protected";
    }
    public String str4(){
        return "public";
    }
}
class Main{
    public static void main(String[] args) {
        AccessModifiers138 obj = new AccessModifiers138();
        System.out.println(obj.str2());
        System.out.println(obj.str3());
        System.out.println(obj.str4());
    }

}
