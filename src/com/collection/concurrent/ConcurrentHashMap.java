package com.collection.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ConcurrentHashMap {

    public static void main(String[] args){
        Map<String,Integer> map = new java.util.concurrent.ConcurrentHashMap<>();

        map.put("ONE",1);
        map.put("TWO",2);
        map.put("THREE",3);
        map.put("FOUR",4);

//        System.out.println("Result "+map);
//        Integer result = map.putIfAbsent("FOUR",5);
//        System.out.println("Result "+result);
//        map.remove("THREE");
//        System.out.println("Result "+map);
//        map.replace("TWO",2,15);
//        System.out.println("Result "+map);

        Thread readerThread = new Thread(()->{
            System.out.println("Read thread started");
            for (String key: map.keySet()){
                System.out.println("READ "+key + "VALUE "+map.get(key));
            }
        });

        Thread writeThread = new Thread(()->{
            System.out.println("Write thread started");
            map.put("FIVE",5);
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
