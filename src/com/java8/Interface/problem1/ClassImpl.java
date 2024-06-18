package com.java8.Interface.problem1;

public class ClassImpl implements Interface1, Interface2 {

    @Override
    public void defaultDisplay() {
        //Interface1.super.defaultDisplay();
        System.out.println("ClassImpl ");
    }

    @Override
    public void instanceMethod() {
        Interface1.super.defaultDisplay();
        System.out.println("instance ");
    }

    public static void main(String[] args){
        Interface1 obj1 = new ClassImpl();
        obj1.defaultDisplay();
        obj1.instanceMethod();
        //obj1.staticdisplay();
    }
}
