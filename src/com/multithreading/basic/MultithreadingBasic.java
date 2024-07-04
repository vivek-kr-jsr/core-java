package com.multithreading.basic;

public class MultithreadingBasic {
    public static void main(String args[]){

        System.out.println("Thread Name: "+Thread.currentThread().getName());

        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
    }
}
