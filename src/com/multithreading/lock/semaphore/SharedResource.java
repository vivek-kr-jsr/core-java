package com.multithreading.lock.semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    private boolean isAvailable = false;
     // Binary semaphore

    public void producer(Semaphore semaphore) {
        try {
            semaphore.acquire();
            System.out.println("Producer Semaphore acquired by: " + Thread.currentThread().getName());
            Thread.sleep(2000); // Simulating read operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println("Producer Semaphore released by: " + Thread.currentThread().getName());
        }
    }

    /*public void consumer(Semaphore semaphore) {
        try {
            semaphore.acquire();
            System.out.println("Consumer Semaphore acquired by: " + Thread.currentThread().getName());
            isAvailable = false; // Simulating write operation
            Thread.sleep(2000); // Simulating some work with the resource
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println("Consumer Semaphore released by: " + Thread.currentThread().getName());
        }
    }*/
}