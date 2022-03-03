package com.syntax.class17;

import com.syntax.class18.AccessModifiers;

public class AccessModifierTester {

    public static void main(String[] args) {

        AccessModifiers a = new AccessModifiers();
        /*
        Can't access name because it hase private access
        can't access age because it has default access
        can't access weight because it has protected access
        can only access color because it has public
        access which can be accessed from anywhere from inside the same project
         */

//        System.out.println(a.name);
//        System.out.println(a.age);
//        System.out.println(a.weight);
        System.out.println(a.color);


    }
}
