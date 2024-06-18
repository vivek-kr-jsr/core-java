package com.java8.methodreference.problem1;

public class ImplementingClass extends BaseClass implements MyInterface{
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.show(); // Outputs: show from BaseClass
    }


    @Override
    public void show() {
        MyInterface.super.show();
    }
}
