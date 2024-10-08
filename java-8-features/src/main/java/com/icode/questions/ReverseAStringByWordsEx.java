package com.icode.questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ReverseAStringByWordsEx {
    public static void main(String[] args) {
        String s = "java is a powerful language";

        LinkedList<Object> collect = Arrays.stream(s.split(" ")).collect(LinkedList::new, LinkedList::addFirst, (a, b) -> a.addAll(0, b));
        System.out.println(collect);
        String reversedString = collect.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(" "));
        System.out.println("Reversed result: "+ reversedString);


        // Method2:
        String input = "hello world";
        System.out.println(" Method2: result: "+ reverseWordsInAStringMethod2(input));
    }

 /*   input : hello world
    output : olleh dlrow*/
    public static  String reverseWordsInAStringMethod2(String s){

        String result = Arrays.stream(s.split(" ")).map(w -> new StringBuffer(w).reverse().toString()).collect(Collectors.joining(" "));
        String result1 = Arrays.stream(s.split(" ")).map(w -> { return new StringBuffer(w).reverse().toString();}).collect(Collectors.joining(" "));
        System.out.println("result1: "+ result1);
        return  result;
    }

}
