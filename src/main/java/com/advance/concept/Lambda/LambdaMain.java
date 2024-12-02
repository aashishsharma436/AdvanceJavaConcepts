package com.advance.concept.Lambda;

import java.util.*;

public class LambdaMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //Lambda is like functional Interface without name , which takes the parameters and perform some operation and return to you;

        list.forEach(System.out::println); // Method reference
        list.forEach(s -> System.out.println(s+2*2));
    }
}
