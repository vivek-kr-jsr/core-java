package com.multithreading.basic.example1;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(()->{
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
                sharedResource.addItem();
        });

        Thread consumeThread = new Thread(()->{
            sharedResource.consumeItem();
        });

        producerThread.start();
        consumeThread.start();

    }
}
