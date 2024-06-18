package com.java8.Interface;

public class Tasla implements Car{
    @Override
    public void carSpeed() {
        System.out.println("150 km /hr Tasla car");
    }

    public void carColour(){
        System.out.println("Red-Orange Tasla colurs");
    }

    public void carLogo(){
        System.out.println(" Tasla Parent logo");
    }

}
