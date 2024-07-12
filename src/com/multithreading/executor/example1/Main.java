package com.multithreading.executor.example1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,
                2, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(),new CumtonRejectPolicy());
        for (int i =1;i<=7;i++){
            Future<?> featureObj = executor.submit(()->{
                try {
                    Thread.sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("Task Processed by: "+ Thread.currentThread());
            });

        }
    }
}
