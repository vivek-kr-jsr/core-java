package com.java8.Interface;

public interface Car {

    public void carSpeed();

    public static void carLogo(){
        System.out.println(" Car Parent logo");
    }

    public default void carColour(){
        System.out.println("Red-black colurs");
    }
}
