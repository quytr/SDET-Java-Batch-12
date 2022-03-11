package com.syntax.reviewclass08;

public class StringClass1 {

    public static void main(String[] args) {

        //ways to define the string
        String str = "SDET Batch 12";
        String employee = "BOB TANDY";
        String employee2 = "Sai gopi krishna gopala kashtabai venkata ramana";
//       String str1 = new String("My value");
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(employee.toLowerCase());
        System.out.println(employee2.length());

        System.out.println("=====================================================");
        String student = "Micheal";
        System.out.println(student.startsWith("M"));
        System.out.println(student.toLowerCase().startsWith("M"));
        System.out.println(student.endsWith("l"));
        System.out.println(student.contains("c"));

        System.out.println("=====================================================");
        String name = "tommy";
        char output = name.charAt(2);
        System.out.println(output);



    }
}
