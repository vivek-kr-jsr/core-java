package com.java8.Interface.problem1;

public interface Interface1 {
    static void staticdisplay() {
        System.out.println("Static Interface 1: Display");
    }
    default void defaultDisplay(){
        System.out.println("Default Interface 1: Display");
    }

    public void instanceMethod();
}
