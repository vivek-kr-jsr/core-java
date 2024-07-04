package com.multithreading.basic;

public class Worker extends Thread{
    private Counter counter;

    public Worker(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for (int i=0;i<1000;i++){
            counter.increment();
        }
    }
}
