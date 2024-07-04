package com.multithreading.basic;

public class MoniterThreadMain {

    public static void main(String[] args) {
        MoniterLock t = new MoniterLock();
        Thread t1=new Thread(()-> t.task1());
        Thread t2=new Thread(()->t.task2());
        Thread t3=new Thread(()->t.task3());

        t1.start();
        t2.start();
        t3.start();
    }
}
