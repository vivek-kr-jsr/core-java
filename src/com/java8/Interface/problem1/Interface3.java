package com.java8.Interface.problem1;

public interface Interface3 extends Interface2, Interface1 {
    @Override
    default void defaultDisplay() {
        //Interface2.super.defaultDisplay();
        System.out.println("Default Interface 3: Display");
    }

    @Override
    default void instanceMethod() {
        System.out.println("Instance Interface 3: Display");
    }

    static void staticdisplay() {
        System.out.println("Static Interface 3: Display");
    }

    public static void main(String[] args){
        System.out.println("Hiio");
        //Interface1.staticdisplay();
    }
}
