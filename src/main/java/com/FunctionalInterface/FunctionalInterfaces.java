package com.FunctionalInterface;

/*
    1. Functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit.
    2. Lambda function is used to represent the instance of a functional interface.
    3. A functional interface can have any number of default methods.
    4. Functional interface is additionally recognized as SAM (Single Abstract Method) interface.

*/

/*
    There are some built in Functional Interfaces
    1. Runnable = This interface contains only the run() method.
    2. Comparable = This interface contains only CompareTo() method.
    3. ActionListener = This interface contains only actionPerformed() method.
    4. Callable = This interface contains only call() method.


    There are 4 main kinds of functional Interfaces
    1. Consumer
    2. Predicate
    3. Function
    4. Supplier

 */

public class FunctionalInterfaces {
    public static void main(String args[]){
        int a = 5;
        //Lambda expression to define the calculation Method
        FunctionalInterfaceAnnotation s = (int x) -> x*x;

        int res = s.calculate(5);
        System.out.println(res);

        // Consumer functional Interface
        ConsumerFunctionalInterface.ConsumerInterface();

        // Predicate Functional Interface
        System.out.println(new PredicateFunctionalInterface().test(5));
        System.out.println(new PredicateFunctionalInterface().test("This is a String class"));

        // 


    }
}
