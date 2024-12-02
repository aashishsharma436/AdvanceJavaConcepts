package com.advance.concept.FunctionalInterface;

/*
    Predicate Functional Interface
        -> It is functional interface like, it accepts the single argument and generates the boolean value
        -> The implementation of Predicate functional interface also encapsulates the logic of filtering
        -> There is another predicate, which is known as Bi-Predicate and take two arguments as a input
*/

interface Predicate<T>{
    boolean test(T t);
}


public class PredicateFunctionalInterface implements Predicate{

    @Override
    public boolean test(Object o) {
        return o instanceof Integer;
    }
}
