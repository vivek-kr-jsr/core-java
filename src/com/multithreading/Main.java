package com.multithreading;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int no = 123321;
        int temp = no;
        // 123321 -- 123321 --palindrom

        int reversNo =0;
        while (temp!=0){
            int digit = temp%10;
            reversNo = reversNo*10+digit;
            temp/=10;
        }
        System.out.println(reversNo==no);
        Map<Integer,Integer> map = new HashMap<>();


    }
}
