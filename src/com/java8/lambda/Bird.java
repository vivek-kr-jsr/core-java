package com.java8.lambda;

@FunctionalInterface
public interface Bird {

    void canFly();

    default void height(){
        // Default implementation
    }

    static void canEat(){
        // static method
    }

    String toString();

    int hashCode();
}
