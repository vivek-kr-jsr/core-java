package com.java8.lamda.buitin;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}
