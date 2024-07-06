package com.multithreading.lock.Reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();
        ReentrantLock lock = new ReentrantLock();

        Thread th1 = new Thread(()->{
            resource1.producer(lock,10);
        });
        Thread th2 = new Thread(()->{
            resource2.producer(lock,10);
        });
        Thread th3 = new Thread(()->{
            resource2.producer(lock,10);
        });
        th1.start();
        //th2.start();
        //th3.start();
    }
}
