package com.multithreading.lock.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();
        //SharedResource sharedResource2 = new SharedResource();

       Semaphore semaphore = new Semaphore(2);




        // Example threads using the shared resource
        Thread producerThread1 = new Thread(() -> sharedResource1.producer(semaphore));
        Thread producerThread2 = new Thread(() -> sharedResource1.producer(semaphore));
        Thread producerThread3 = new Thread(() -> sharedResource1.producer(semaphore));
        Thread producerThread4 = new Thread(() -> sharedResource1.producer(semaphore));


        producerThread1.start();
        producerThread2.start();
        producerThread3.start();
        producerThread4.start();

    }
}

