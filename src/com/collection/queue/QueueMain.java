package com.collection.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueMain {

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.offer(70);
        queue.offer(80);
        System.out.println(queue.toString());
        int K=4;
        int n= queue.size();
        //[40, 30, 20, 10, 50, 60, 70, 80]
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<K;i++){
            stack.push(queue.poll());
        }
        for (int i=0;i<K;i++){
            queue.offer(stack.pop());
        }
        for (int i=0;i<n-K;i++){
            queue.offer(queue.poll());
        }
        System.out.println(queue.toString());
    }

}
