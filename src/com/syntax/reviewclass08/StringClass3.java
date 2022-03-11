package com.syntax.reviewclass08;

public class StringClass3 {

    public static void main(String[] args) {

        String message = "This is great batch but in dreams";

        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i) + " ");
        }

        String c = "Hello i love java";
        boolean var;
        var = c.startsWith("hello");
        System.out.println(var);

        String obj = "I LIKE JAVA";
        System.out.println(obj.charAt(3));

        String str = "0123456789";
        System.out.println(str.substring(4));

        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

        System.out.println(replace);

        String str_Sample = "RockStar";
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

//        int i = 50;
//
//        int[] a = new int[10];
//
//        System.out.println(a.length);
//
//        a = new int[100];
//
//        System.out.println(a.length);
//
//        a = new int[i];
//
//        System.out.println(a.length);

//        int[] a = {12, 15, 11, 13, 9, 25};
//        int[] a2 = {12, 15, 11, 13, 9, 25};
//        int sum = 0;
//        for (int i = 0; i <a.length; i++) {
//            if (a[i] % 2== a2[i ] % 5)  {
//                sum += i * i;
//            }
//        }
//        System.out.println("sum = " + sum);
//
//        int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };
//
//        for ( int index= 0 ; index < 5 ; index++ ) {
//            System.out.print( egArray[ index ] + " " );
//        }

//        char array_variable [] = new char[10];
//        for (int i = 0; i < 10; ++i) {
//            array_variable[i] = 'i';
//            System.out.print(array_variable[i] + " ");
//        }

        int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int sum = 0;

        for (int i = 0; i < 3; ++i) {

            for (int j = 0; j < 3; ++j) {

                sum = sum + array_variable[i][j];

            }

        }

        System.out.print(sum / 5);

        int[] array = { 1, 4, 3, 6, 8, 2, 5 };

        int what = array[0];

        for (int index = 0; index < array.length; index++) {

            if (array[index] > what) {

                what = array[index];

            }

        }

        System.out.println(what);

        int[] zip = new int[5];

        zip[0] = 7;
        zip[1] = 3;
        zip[2] = 4;
        zip[3] = 1;
        zip[4] = 9;

        System.out.println( zip[ 2 + 1 ] );

        int x=1;

        while(x<5) {

            x++;

            System.out.print(x);

        }


        int count = 0;
        while (count++ < 10) {
            System.out.println("Welcome to Java");
        }

        int y = 0;
        for (int i = 0; i < 10; ++i) {
            y += 1;
        }
        System.out.println(y);



//        System.out.println("i after the loop = " + i );

        System.out.println("=============");
        for(int i = 0; i <= 5; i++ )
        {
            System.out.println("i = " + i );
        }
        System.out.println("=============");

        int k=3, tot=0;

        do{

            tot=tot+k;

            k++;

        } while(k<11);

        System.out.print(tot);
        System.out.println("=============");

        int x2=1;

        do{

            x2++;

            System.out.print(x2);


        }while(x2<5);

        System.out.println("=============");

        int z=2, sum1=0;

        while(z<9) {

            z++;

            sum1=sum1+z;

        }

        System.out.print(sum1);

        System.out.println("=============");

        int m=2, total=0;

        while(m<6) {

            total=total+m;

            m++;

        }

        System.out.print(total);

    }
}
