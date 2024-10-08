package com.devuniverse.features;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntUnaryOperator;
import java.util.stream.Stream;

public class StreamBasics1 {
    public static void main(String[] args) {

        int[] nums = {1,3,4};

        OptionalInt max = Arrays.stream(nums).map(IntUnaryOperator.identity()).max();
        System.out.println("max: "+ ( max.isPresent() ? max.getAsInt() : "No Eelement found"));



    }
}
