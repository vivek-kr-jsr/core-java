package com.multithreading.basic;

public class ThreadJava8 {

    public static void main(String args[]){
        Runnable task = () -> {
            for (int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getId());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
