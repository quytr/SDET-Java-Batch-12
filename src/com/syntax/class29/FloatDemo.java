package com.syntax.class29;

import java.math.BigDecimal;

public class FloatDemo {
    public static void main(String[] args) {

        //Don't need to worry about
        float fl=1/3f;
        if(fl==3.33) {
            System.out.println("Equal");
        }else {
            System.out.println("not");
        }
//        System.out.println(10/3);

        BigDecimal bigDecimal = new BigDecimal(1.333333333333333);
        System.out.println(bigDecimal);
        float f = 1.333333333333333f;
        double f2 = 1.333333333333333;
        System.out.println(f);
        System.out.println(f2);
    }
}
