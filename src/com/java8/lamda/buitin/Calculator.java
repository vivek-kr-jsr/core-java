package com.java8.lamda.buitin;

import java.util.function.BiFunction;

public class Calculator {

    // method that take two integer and function as a parameter
    public int operate(int a, int b, BiFunction<Integer,Integer,Integer> func){
        return func.apply(a,b);
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println("Add "+ calculator.operate(2,4,(x,y)->x+y));
        System.out.println("Sub "+ calculator.operate(2,4,(x,y)->x-y));
        System.out.println("Multiply "+ calculator.operate(2,4,(x,y)->x*y));
        System.out.println("Division "+ calculator.operate(2,4,(x,y)->y/x));
    }
}
