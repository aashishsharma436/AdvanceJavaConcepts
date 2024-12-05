package com.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    /*
        Consumer Functional Interface
        -> The consumer interface of the functional interface is the only accepts one argument or a gentrified argument.
        -> The consumer interface has no return value. It returns nothing
        -> There is another interface also, which is known as Bi-consumer interface which intakes 2 arguments and has no return value
         */
    public static void ConsumerInterface() {
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        // or
        consumer = System.out::println; // It is method reference
        consumer.accept(5);

        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Hello this is String class");
    }
}
