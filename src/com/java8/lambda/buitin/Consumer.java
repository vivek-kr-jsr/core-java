package com.java8.lambda.buitin;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}
