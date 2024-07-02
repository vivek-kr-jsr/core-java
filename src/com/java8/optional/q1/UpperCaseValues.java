package com.java8.optional.q1;

import java.util.Optional;

public class UpperCaseValues {

    public static void main(String[] args){
        //String name = getName();
        String name;

        Optional<?> opt = getOptionalName();
        if(opt.isPresent()){
            name = (String) opt.get();
            name = name.toUpperCase();
            System.out.println(name);
        }
    }

    public static String getName(){
        //return "Rohan Singh";
        return null;
    }

    public static Optional<?> getOptionalName(){
        String name = null;
        Optional<String> value = null;
        value = Optional.ofNullable(name);
        return value;
    }
}
