package com.collection.list;

import java.util.*;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args){

        List<Integer> list = new LinkedList<>();

        // Adding element in list

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(60);


        System.out.println(list);

        int N=7;
        int K=3;
        System.out.println(josephus(N,K));
    }

    public static int josephus(int N, int K){
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements for 0 to n-1
        for (int i=0;i<N;i++){
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();

        //Run this loop until there is no element left in the list
        while (list.size()>1){
            int count = 1;

            // find nth element
            while (count<K){
                while (it.hasNext() && count<= K){
                    it.next();
                    count++;
                }

                // if this is true mean we are reach end of the list
                // and the count is less then k, so we will move iterator
                //from end to first
                if (count<K){
                    it = list.iterator();
                    it.next();
                    count++;
                }

                //Remove kth elements
                it.remove();
            }
        }
        return list.getFirst();
    }
}
