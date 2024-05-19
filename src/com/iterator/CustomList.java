package com.iterator;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomList implements Iterable<Integer>{

    private int[] elements;
    private int size;
    private int modCount; // Modification count for fail-fast iterator

    public CustomList(){
        elements=new int[10];
        size=0;
        modCount=0;
    }

    public void add(int element){
        ensureCapacity();
        elements[size++]=element;
        modCount++;
    }

    public int getSize(){
        return size;
    }

    private void ensureCapacity(){
        if (size == elements.length){
            int[] newElements = new int[elements.length*2];
            System.arraycopy(elements,0,newElements,0,size);
            elements=newElements;
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new CustomListIterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }

    private class CustomListIterator implements Iterator<Integer> {
        private int cursor;
        private int expectedModCount;

        public CustomListIterator(){
            cursor=0;
            expectedModCount=modCount;
        }

        @Override
        public boolean hasNext() {
            checkForModification();
            return cursor<size;
        }

        @Override
        public Integer next() {
            checkForModification();
            if(!hasNext()){
                throw new java.util.NoSuchElementException();
            }
            return elements[cursor++];
        }

        private void checkForModification() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
