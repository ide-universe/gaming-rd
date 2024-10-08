package com.faq;

import java.util.Arrays;

public class SumOfSquaresOfEventNumbersInAList {
    public static void main(String[] args) {

//        sum of squares of even numbers

        Integer[] intArray = {9,1,2,3,4,5,6,7};

        Integer evenSquaresSum = Arrays.stream(intArray).filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, (a, b) -> a + b);
        System.out.println("Even Square Sum: "+ evenSquaresSum);
    }
}
