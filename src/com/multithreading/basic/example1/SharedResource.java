package com.multithreading.basic.example1;

public class SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem() {
        System.out.println("producer thread inside producer method addItem: " + isItemPresent);

        isItemPresent = true;
        notify();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumer inside consumeItem method addItem: " + isItemPresent);
        while (!isItemPresent) {
            try {
                System.out.println("Consumer thread is waiting : " + isItemPresent);
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        isItemPresent = false;
    }
}
