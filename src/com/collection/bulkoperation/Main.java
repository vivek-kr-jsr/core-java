package com.collection.bulkoperation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // boolean containsAll(Collection<?> c)

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);


        List<Integer> list2 = new ArrayList<>();
        list2.add(10);;
        list2.add(25);

        System.out.println("Actual list "+list1.toString());
        System.out.println(" Is list1 contain all element of list2: "+list1.containsAll(list2));

        // boolean addAll(collection<? extends E> c)

        System.out.println("Add element of list to list 1 "+list1.addAll(list2));
        System.out.println(list1.toString());

        // boolean removeAll(Collection<?> c)

        System.out.println("RemoveAll items from list1 that present in list2 : "+list1.removeAll(list2));
        System.out.println(list1.toString());

        // boolean reatainAll(Collection<?> c): retain value which match in both list else not

        System.out.println("RetainAll items from list1 that present in list2 : "+list1.retainAll(list2));
        System.out.println(list1.toString());

        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(52);
        list1.add(61);

        System.out.println(list1.toString());

        // boolean removeIf(Predicate<? extends E> p)
        list1.removeIf((x)-> x%2!=0);
        System.out.println(list1.toString());

        System.out.println("-----Iterator----");

        // Iteration in collection 1. iterator 2. For-Each 3. forEach 4. Stream

        Iterator<Integer> it = list1.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----For-Each-----");
        for (Integer itr: list1){
            System.out.println(itr);
        }
        System.out.println("-----forEach----");
        list1.forEach(System.out::println);

        System.out.println("----Stream-----");
        list1.stream().forEach(System.out::println);
    }
}
