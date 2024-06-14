package com.java8.stream;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        // Different ways to create stream

        List<String> list = Arrays.asList("a","b","c");
        Stream<String> stream = list.stream(); // 1. Using Collection.stream()
        Stream<String> parallelStream = list.parallelStream(); // 2. Using Parallel Stream

        String[] array = {"a","b","c"};
        Stream<String> arrayStream = Arrays.stream(array);
        Stream<String> streamof = Stream.of(array);

        Stream<Integer> streamOfFun = Stream.iterate(0,n->n+2).limit(10);
        Stream<Double> streamMath = Stream.generate(Math::random).limit(10);

        try(Stream<String> streamfile = Files.lines(Paths.get("file.txt"))){
            // process
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stream<String> streamPattern = Pattern.compile(",").splitAsStream("a,b,c");
        Stream<String> empty = Stream.empty();

        Stream<String> stringStream = java.util.stream.Stream.<String>builder().add("a").add("b").add("c").build();
    }
}
