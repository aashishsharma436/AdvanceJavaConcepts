package com.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    /*
    The Supplier Functional Interface is also a type of Functional interface that does not take any input or argument still returns a single output.
    This type of functional interface is generally used in the lazy generation of values.
    Supplier functional interfaces are also used for defining the logic for the generation of any sequence.
     */
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random Number 1: "+randomSupplier.get());


        Supplier<String> stringSupplier = () -> "Hello, Supplier!";
        System.out.println("Message: "+stringSupplier.get());
    }
}
