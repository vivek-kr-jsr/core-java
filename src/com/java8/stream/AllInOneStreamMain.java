package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllInOneStreamMain {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("John", "Doe", 30),
                new Person("Jane", "Doe", 25),
                new Person("Jack", "Smith", 40),
                new Person("Jill", "Smith", 35),
                new Person("John", "Smith", 50),
                new Person("Jane", "Johnson", 30),
                new Person("Jake", "Johnson", 20)
        );

        List<String> result = people.stream()
                // Filter people with age greater than 25
                .filter(person -> person.getAge()>25)
                // Map to full name
                .map(person -> person.getFirstName()+" "+person.getLastName())
                // Flatten nested lists (not needed here but included for completeness)
                .flatMap(name-> Arrays.stream(name.split(" ")))
                // Remove duplicates
                .distinct()
                // Sort names
                        .sorted()
                                .peek(System.out::println)
                                        .limit(5)
                                                .skip(1)
                                                        .collect(Collectors.toList());

        System.out.println(result.toString());

        List<Integer> numbers = Arrays.asList(2, 1, 4, 7, 10);
        Stream<Integer> numbersStream = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .peek((Integer val) -> System.out.println("after filter:" + val))
                .map((Integer val) -> (val * -1))
                .peek((Integer val) -> System.out.println("after negating:" + val))
                .sorted()
                .peek((Integer val) -> System.out.println("after Sorted:" + val));

        List<Integer> filteredNumberStream = numbersStream.collect(Collectors.toList());
    }
}
