package com.devuniverse.onlinetest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class StreamsEx1
{
    public static void main( String[] args )
    {
        List<String> namesList = Arrays.asList("ram", "shyam", "hari", "arjun");

        namesList.stream().forEach(System.out::println);

        //ways to find max in a list using streams
        //1
        List<Integer> list = Arrays.asList(1, 34, 4, 7, 8);
        Optional<Integer> maxValue = list.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("Max value: " + maxValue.get());

        //2
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        System.out.println("Max value: " + max.get());

        //sqare the values in a list

        List<Integer> squaresList = list.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println("Squares list: " + squaresList);




    }
}
