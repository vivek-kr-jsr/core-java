package com.collection.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionCuncurrent {


    public static void main(String[] args){
        List<String> arr = new CopyOnWriteArrayList<>();
        //List<String> arr = new ArrayList<>();
        arr.add("ONE");
        arr.add("TWO");
        arr.add("THREE");
        arr.add("FOUR");

        Thread readerThread = new Thread(()->{
            System.out.println("Read thread started");
            for (String str: arr){
                System.out.println("READ "+str);
            }
        });

        Thread writeThread = new Thread(()->{
            System.out.println("Write thread started");

            arr.add("FIVE");


        });
        readerThread.start();
        writeThread.start();
        try {
            writeThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
