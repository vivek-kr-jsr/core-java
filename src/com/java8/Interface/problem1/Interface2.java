package com.java8.Interface.problem1;

public interface Interface2 {
    static void staticdisplay() {
        System.out.println("Static Interface 2: Display");
    }
    default void defaultDisplay(){
        System.out.println("Default Interface 2: Display");
    }

    public void instanceMethod();
}
