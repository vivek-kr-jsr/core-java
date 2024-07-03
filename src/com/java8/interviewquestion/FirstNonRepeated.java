package com.java8.interviewquestion;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

// Given a String, find the first non-repeated character in it using Stream functions
public class FirstNonRepeated {
    public static void main(String args[]){
        String input = "Java articles are Awesome";

        Optional<Character> result = input.chars()
                .mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst();

        // Check if a result is present and print it
        if (result.isPresent()) {
            System.out.println("First non-repeated character is: " + result.get());
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
