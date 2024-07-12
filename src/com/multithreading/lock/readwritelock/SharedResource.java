package com.multithreading.lock.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    private boolean isAvailable = false;

    public void producer(ReadWriteLock lock) {
        lock.readLock().lock();
        try {
            System.out.println("Producer Read lock acquired by: " + Thread.currentThread().getName());
            Thread.sleep(2000); // Simulating read operation
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        } finally {
            System.out.println("Producer Read lock released by: " + Thread.currentThread().getName());
            lock.readLock().unlock();

        }
    }

    public void consumer(ReadWriteLock lock) {
        lock.writeLock().lock();
        try {
            System.out.println("Consumer Write lock acquired by: " + Thread.currentThread().getName());
            isAvailable = false; // Simulating write operation
            Thread.sleep(1000); // Simulating some work with the resource
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        } finally {
            System.out.println("Consumer Write lock released by: " + Thread.currentThread().getName());
            lock.writeLock().unlock();

        }
    }
}