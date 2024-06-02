package com.java8.lamda;

public class Main {

    public static void main(String[] args){
        Bird egaleObject = new Bird() {
            @Override
            public void canFly() {
                System.out.println("Engle is flying");
            }
        };

        egaleObject.canFly();

        // lamda expression
        Bird pigonObject = ()-> System.out.println("Pigon is flying");
        pigonObject.canFly();
    }
}
