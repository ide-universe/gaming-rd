package com.faq;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonReapeatingCharacterInAStringJava8Ex {
    public static void main(String[] args) {
        String str = "lirilsoap";

        // method: 1
        String ch = findFirstNonReaptingCharacter(str);
        System.out.println(ch);

        // method: 2
        System.out.println(findFirstNonReaptingCharacterMethodTwo(str));
    }

    private static String findFirstNonReaptingCharacter(String str) {

        Optional<String> first = Arrays.stream(str.split("")).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst();

        if(first.isPresent())
            return  first.orElseGet(() -> "Not Found");
        else
            return "";
    }

    private static String findFirstNonReaptingCharacterMethodTwo(String str) {
        Optional<Character> c1 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(c1.isPresent())
            return c1.get().toString();
        else
           return "Not Found";

    }
}
