package com.multithreading.lock.Reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock lock,int n){
        if(n==0){
            return;
        }
        try {
            lock.lock();
            System.out.println("Lock acquired by: "+Thread.currentThread().getName());
            producer(lock,n-1);
            Thread.sleep(4000);
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Lock release by: "+Thread.currentThread().getName());
        }
    }
}
