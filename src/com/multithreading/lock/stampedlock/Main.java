package com.multithreading.lock.stampedlock;

import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();
        StampedLock stampedLock=new StampedLock();

        Thread th1 = new Thread(()->{
            sharedResource.producer(stampedLock);
        });
        Thread th2 = new Thread(()->{
            sharedResource.producer(stampedLock);
        });
        Thread th3 = new Thread(()->{
            sharedResource.consumer(stampedLock);
        });

        th1.start();
        th2.start();
        th3.start();
    }
}
