package com.multithreading.basic;

public class MonitorLockExample {
    public static void main(String args[]) throws InterruptedException {
        Counter counter=new Counter();

        Worker worker1 = new Worker(counter);
        Worker worker2 = new Worker(counter);
        Worker worker3 = new Worker(counter);

        worker1.start();
        worker2.start();
        worker3.start();

        // Wait for all threads to finish
        worker1.join();
        worker2.join();
        worker3.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
