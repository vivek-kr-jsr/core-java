package com.collection.list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ListIterator;

public class MainList {
    public static void main(String args[]){

        java.util.List<Integer> list1 = Arrays.asList(1, 2, 8, 7, 6, 5, 3, 4);

        ListIterator<Integer> it = list1.listIterator();
        System.out.println("------1. ListIterator-------");
        System.out.println("------1 a. ListIterator methods forward-------");

        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("------1 b. ListIterator methods backward-------");

        while (it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
        System.out.println();
        System.out.println("------1 c. ListIterator methods set-------");
        while (it.hasNext()){
            int c = (Integer)it.next();
            it.set(c*2);
            System.out.print(c*2+" ");
        }

        //Internal working of Array
        /*-> If current array become full, do the following
                ->Create a new array of double size
                ->copy the element from old space to new
                -> Free old space*/
//        -> TC insertion at end O(N)~O(1)
//        -> TC insertion at the start O(N)
//        -> TC insertion in random position O(N)
//        -> TC deletion at end O(N)
//        -> TC deletion at the start O(N)
//        -> TC deletion in random position O(N)
//        -> Search Time complexity O(N)
//        -> Sort time complexity O(NLOGN)



    }
}
