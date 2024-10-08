package com.devuniverse.onlinetest;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysBinarySearchEx {
    public static void main(String[] args) {
        String[] cities = {"Banglaore", "Chennai", "Hyderabad", "New York"};

        MyCom mc = new MyCom();

//        Arrays.sort(cities, mc);

        System.out.println(Arrays.binarySearch(cities, "New York", mc));


    }// main
} // class

class MyCom<String> implements Comparator<String> {


    @Override
    public int compare(Object a, Object b) {
        return ((java.lang.String)b).compareTo((java.lang.String) a);
    }
}

