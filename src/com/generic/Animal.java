package com.generic;

import java.util.List;

public class Animal {

    String name;

    public Animal(String name){
        this.name = name;
    }

    public Animal(){

    }
    public static void print(List<Animal> animals){
        for(Animal animal:animals){
            System.out.println(animal.name);
        }
    }
}

