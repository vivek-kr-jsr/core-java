package com.java8.methodreference.problem1;

public interface MyInterface {
    default void show() {
        System.out.println("show from MyInterface");
    }
}
