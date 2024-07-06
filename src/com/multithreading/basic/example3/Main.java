package com.multithreading.basic.example3;

import com.multithreading.basic.example2.SharedResources;

public class Main {
    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources(7);
        System.out.println("Main Thread started ");
        Thread t1=new Thread(()->{

                try {
                    sharedResources.producer(4);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        });
        Thread t2=new Thread(()->{
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }

                try {
                    sharedResources.producer(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        });
        //t1.setDaemon(true);
        //t2.setDaemon(true);
        t1.start();
        t2.start();

//        t1.suspend();
//        try {
//            Thread.sleep(3000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        t1.resume();

        //t2.stop();
        try {
            t2.join();
            t1.join();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Main Thread Ended ");
    }
}
