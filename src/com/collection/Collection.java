package com.collection;

import java.util.Iterator;

public interface Collection<E> extends Iterable<E> {
    // Returns the number of elements in this collection
    int size();

    // Returns true if this collection contains no elements
    boolean isEmpty();

    // Adds the specified element to this collection
    boolean add(E element);

    // Removes the specified element from this collection
    boolean remove(Object element);

    // Removes all of the elements from this collection
    void clear();

    // Returns true if this collection contains the specified element
    boolean contains(Object element);

    // Returns an iterator over the elements in this collection
    Iterator<E> iterator();

    // Returns an array containing all of the elements in this collection
    Object[] toArray();

    // Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array
    <T> T[] toArray(T[] a);
}
