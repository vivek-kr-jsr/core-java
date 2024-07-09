package com.multithreading.lock.Reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();
        ReentrantLock lock = new ReentrantLock();

        Thread th1 = new Thread(()->{
            resource1.producer(lock);
        });
        Thread th2 = new Thread(()->{
            resource2.producer(lock);
        });
        Thread th3 = new Thread(()->{
            resource2.producer(lock);
        });
        Thread th4 = new Thread(()->{
            resource1.consumer(lock);
        });
        Thread th5 = new Thread(()->{
            resource2.consumer(lock);
        });
        Thread th6 = new Thread(()->{
            resource2.consumer(lock);
        });
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
    }
}
