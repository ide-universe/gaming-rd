package com.icode.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class JavaExample {

    public static void main(String[] args) {
        String s="java";


        String result = Arrays.stream(s.split("")).collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.joining());



        System.out.println(result);
    }
}
