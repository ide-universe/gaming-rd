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
public class StreamsEx2
{
    public static void main( String[] args )
    {
        List<String> namesList = Arrays.asList("ram", "shyam", "hari", "arjun");

        namesList.stream().forEach(System.out::println);




    }
}
