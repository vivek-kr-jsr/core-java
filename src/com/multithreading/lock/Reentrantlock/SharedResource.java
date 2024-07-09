package com.multithreading.lock.Reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock lock){

        try {
            lock.lock();
            System.out.println("Producer Lock acquired by: "+Thread.currentThread().getName());
            Thread.sleep(4000);
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Producer Lock release by: "+Thread.currentThread().getName());
        }
    }
    public void consumer(ReentrantLock lock){

        try {
            lock.lock();
            System.out.println("Consumer Lock acquired by: "+Thread.currentThread().getName());
            Thread.sleep(4000);
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Consumer Lock release by: "+Thread.currentThread().getName());
        }
    }
}
