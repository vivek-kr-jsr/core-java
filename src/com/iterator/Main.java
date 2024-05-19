package com.iterator;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CustomList list = new CustomList();
        list.add(1);
        list.add(2);
        list.add(3);

        // Iterate over the elements using the iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i=0;i<10000;i++){
            list1.add(i);
        }

        List<Integer> linkedlist = new LinkedList<>();
        for (int i=0;i<10000;i++){
            linkedlist.add(i);
        }

        Set<Integer> queue = new TreeSet<>();
        for (int i=0;i<10000;i++){
            queue.add(i);
        }

        Set<Integer> hashSet = new HashSet<>();
        for (int i=0;i<10000;i++) {
            hashSet.add(i);
        }


            long time5 = timeMethod(() -> {
            // Your method to be timed here
            // ...
            iterate(list1);
        });
        long time6 = timeMethod(() -> {
            // Your method to be timed here
            // ...
            iterate(linkedlist);
        });
        long time7 = timeMethod(() -> {
            // Your method to be timed here
            // ...
            iterate(hashSet);
        });
        long time8 = timeMethod(() -> {
            // Your method to be timed here
            // ...
            iterate(queue);
        });

//        long time1 = timeMethod(() -> {
//            // Your method to be timed here
//            // ...
//            removeByCondtion(list1);
//        });
//        long time2 = timeMethod(() -> {
//            // Your method to be timed here
//            // ...
//            removeByCondtion(linkedlist);
//        });
//        long time3 = timeMethod(() -> {
//            // Your method to be timed here
//            // ...
//            removeByCondtion(hashSet);
//        });

        long time4 = timeMethod(() -> {
            // Your method to be timed here
            // ...
            removeByCondtion(queue);
        });




        //removeByCondtion(queue);


        /*System.out.println(list1.toString());
        System.out.println(linkedlist.toString());
        System.out.println(linkedlist.toString());
        System.out.println(queue.toString());*/

        //System.out.println("Time taken List :"+time1);
        //System.out.println("Time taken LinkList: "+time2);
        //System.out.println("Time taken  Set: "+time3);
        System.out.println("Time taken  TreeSet: "+time4);

        System.out.println("Time taken it List :"+time5);
        System.out.println("Time taken it LinkList: "+time6);
        System.out.println("Time taken it Set: "+time7);
        System.out.println("Time taken it TreeSet: "+time8);

    }

    public static void removeByCondtion(Collection<?> c){
        Iterator<?> it = c.iterator();
        while (it.hasNext()){
            if((Integer) (it.next())%2==0){
                it.remove();
            }
        }
    }


    public static long timeMethod(Runnable method) {
        long startTime = System.nanoTime();
        method.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void iterate(Collection<?> c){
        Iterator<?> it = c.iterator();
        while (it.hasNext()){
            System.out.println("no : "+it.next());
        }
    }

}
