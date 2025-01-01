package com.Lambda;

import java.util.*;

interface fun{
    void abstractFun(int x);
    default void normalFun(){
        System.out.println(" This is a Normal Function");
    }
}
public class LambdaMain {
    public static void main(String[] args) {
        /*
        1. Lambda expression is a type of function without name
        2. Lambda expression basically expresses instances of functional interfaces.
        3. Lambda expression implements the only abstract function and therefore implements functional interfaces
        4. It is beneficial for iterating, filtering, and extracting data.
        5. It enables to treat a functionality as a method argument, or data as data
        6. A function that can be created without belonging any class
        7. A lambda expression can be passed around as if it was an object and executed on demand.
         */
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //Lambda is like functional Interface without a name, which takes the parameters and perform some operation and return to you;

        list.forEach(x -> System.out.print(x+ " "));
        System.out.println();
        list.forEach(s -> System.out.print(s+2*2+" "));
        System.out.println();
        System.out.print("Output of customized Lambda: ");

        // creating own Lambda expression
        fun fob = (int x) -> System.out.println(2*x);
        fob.abstractFun(4);
    }
}
