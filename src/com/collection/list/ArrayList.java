package com.collection.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayList<E> implements List<E>{
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public ArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public boolean remove(Object element) {
        // Implement removal logic here
        return false;
    }

    @Override
    public void clear() {
        // Clear the elements array and reset size
        Arrays.fill(elements, null);
        size = 0;
    }

    @Override
    public boolean contains(Object element) {
        // Implement contains logic here
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        // Implement iterator logic here
        return null;
    }


    @Override
    public void forEach(Consumer<? super E> action) {
        // Implement forEach logic here
    }

    @Override
    public Spliterator<E> spliterator() {
        // Implement spliterator logic here
        return null;
    }

    @Override
    public Object[] toArray() {
        // Implement toArray logic here
        return Arrays.copyOf(elements, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // Implement toArray logic here
        if (a.length < size) {
            return (T[]) Arrays.copyOf(elements, size, a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean add(E element) {
        // Check capacity and resize if necessary
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        // Add the element and increment size
        elements[size++] = element;
        return true;
    }

    @Override
    public E get(int index) {
        // Check index validity
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    @Override
    public boolean remove(int index) {
        // Check index validity
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        // Shift elements to remove the element at the specified index
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null; // Clear the last element and decrement size
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
