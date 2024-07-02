package com.java8.interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SumOfNumbers {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        Optional<Integer> sum =list.stream().reduce((a, b)->a+b);
        System.out.println("Sum of numbers "+sum.get());
    }
}
