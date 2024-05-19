package com.collection.list;

import com.collection.Collection;

public interface List<E> extends Collection<E> {

    // Appends the specified element to the end of this list
    boolean add(E element);

    // Returns the element at the specified position in this list
    E get(int index);

    // Removes the element at the specified position in this list
    boolean remove(int index);

    // Returns the number of elements in this list
    int size();

    // Returns true if this list contains no elements
    boolean isEmpty();
}
