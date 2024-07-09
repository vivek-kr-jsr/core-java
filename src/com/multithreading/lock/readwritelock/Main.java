package com.multithreading.lock.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        ReadWriteLock lock = new ReentrantReadWriteLock();


        Thread th1 = new Thread(() -> sharedResource.producer(lock), "Producer-1");
        Thread th2 = new Thread(() -> sharedResource.producer(lock), "Producer-2");
        Thread th3 = new Thread(() -> sharedResource.producer(lock), "Producer-3");
        Thread th4 = new Thread(() -> sharedResource.consumer(lock), "Consumer-1");
        Thread th5 = new Thread(() -> sharedResource.consumer(lock), "Consumer-2");

        th1.start();
        th4.start();
        th2.start();
        th3.start();

        th5.start();
    }
}
