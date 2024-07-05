package com.multithreading.basic.example2;

public class Main {
    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources(5);


        Thread producerThread = new Thread(()->{
            int item = 1;
            try {
                while (true){
                    sharedResources.producer(item++);
                    //Thread.sleep(150);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        Thread consumeThread = new Thread(()->{

            try {
                while (true){
                    sharedResources.consumer();
                    //Thread.sleep(100);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumeThread.start();
    }
}
