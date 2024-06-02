package com.java8.anonymousclass;

public class Main {
    public static void main(String[] args){

        //Here's an example of using an anonymous class to implement an interface:
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Everyone");
            }
        };

        greeting.sayHello();

        Operation addition = new Operation() {
            @Override
            public int execute(int a, int b) {
                return a+b;
            }
        };
        Operation subtraction = new Operation() {
            @Override
            public int execute(int a, int b) {
                return a-b;
            }
        };
        Operation multiplication = new Operation() {
            @Override
            public int execute(int a, int b) {
                return a*b;
            }
        };
        Operation division = new Operation() {
            @Override
            public int execute(int a, int b) {
                return b/a;
            }
        };
        System.out.println("Addition "+addition.execute(2,4));
        System.out.println("Multiplication "+multiplication.execute(2,4));
        System.out.println("Division "+division.execute(2,4));

    }
}
