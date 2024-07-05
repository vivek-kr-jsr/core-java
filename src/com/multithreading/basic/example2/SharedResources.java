package com.multithreading.basic.example2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SharedResources {
    private Queue<Integer> queue;
    private int capacity;
    public SharedResources(int capacity){
        this.queue=new LinkedList();
        this.capacity = capacity;
    }

    public synchronized void producer(int items) throws InterruptedException {
        while (queue.size()==capacity){
            System.out.println("Producer is waiting... "+" Queue size: "+queue.size());
            wait();
        }
        queue.offer(items);
        System.out.println("Produced : "+items+" Queue size: "+queue.size());
        notifyAll();
    }

    public synchronized int consumer() throws InterruptedException {
        while (queue.isEmpty()){
            System.out.println("Consumer is waiting... "+" Queue size: "+queue.size());
            wait();
        }
        int item = (int)queue.poll();
        System.out.println("Consume :"+item+" Queue size: "+queue.size());
        notifyAll();
        return item;
    }
}
