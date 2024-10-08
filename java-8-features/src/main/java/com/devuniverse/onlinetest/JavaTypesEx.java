package com.devuniverse.onlinetest;

public class JavaTypesEx  {
    public static void main(String[] args) {

        try {
            Float f = new Float("3.0");

            System.out.println(" Float : f = "+ f);
            int val = f.intValue();
            System.out.println("int val= "+ val);

            byte b = f.byteValue();

            System.out.println(" byte b= "+ b);

            System.out.println(f + val + b);


        } catch (NumberFormatException e) {
            throw new RuntimeException(e);

        }


    }
}
