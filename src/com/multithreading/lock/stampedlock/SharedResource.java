package com.multithreading.lock.stampedlock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    private boolean isAvailable = false;

    public void producer(StampedLock lock) {
        long stamp = lock.readLock();
        try {
            System.out.println("Producer Read lock acquired by: " + Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(2000); // Simulating read operation
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlockRead(stamp);
            System.out.println("Producer Read lock released by: " + Thread.currentThread().getName());
        }
    }

    public void consumer(StampedLock lock) {
        long stamp = lock.writeLock();
        try {
            System.out.println("Consumer Write lock acquired by: " + Thread.currentThread().getName());
            isAvailable = false; // Simulating write operation
            Thread.sleep(1000); // Simulating some work with the resource
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Consumer Write lock released by: " + Thread.currentThread().getName());
        }
    }
}
