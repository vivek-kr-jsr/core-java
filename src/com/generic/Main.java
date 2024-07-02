package com.generic;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // type casting
        int i=5;
        double j=i;
        int k= (int) j;
        String s;
        s = String.valueOf(k);
        char c[] ={'s','o','n','u'};
        String str = s;
        float f = i;
        //Object dog = (Object) new Animal();

        Pair<Integer,String> p = new Pair<>();
        p.x=12;
        p.y="sony";
        //String str1 =  (String) p.x;

        // type casting in inheritance
        Animal animal1 = new Animal("AAA1");
        Animal animal2 = new Animal("AAA2");



        List<Animal> list = new ArrayList<>();
        list.add(animal1);
        list.add(animal2);
        //print(list);

        Dog dog1 = new Dog("DDD1");
        Dog dog2 = new Dog("DDD2");

        list.add(dog1);
        list.add(dog2);
        Animal.print(list);
        // typecasting in generic
        //ArrayList<? super Dog> a = new ArrayList<>();
        //ArrayList<Dog> b = new ArrayList<>();
        //a=b;
    }


}