package com.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/*
A function is a type of functional interface in java that receives only a single arguments and returns a value after
the required processing.
 */
@FunctionalInterface    // we can define the annotation also we want to make any interface as a functional interface
public interface FunctionalInterfaceAnnotation {
    int calculate(int x);
}
class Bifunction implements FunctionalInterfaceAnnotation{
    public static void bifunction() {
        BiFunction<String, Integer, String> concatenate = (str1, str2) -> str1 + str2;
        BiFunction<Integer,Double,String> combine = (integer,decimal) -> "Combined Value: "+integer+" and "+decimal;
        String combinedResult = combine.apply(10,20.5);
        String result =  concatenate.apply("Aashish ", 23);
        System.out.println(combinedResult);
        System.out.println(result);
    }

    public static void binaryOperator(){
        BinaryOperator<Integer> addOperator = (a,b) -> a+b;
        Integer res = addOperator.apply(3,7);
        System.out.println("Result of Binary Operator is: "+res);
    }

    public static void unaryOperator(){
        UnaryOperator<Integer> doubleOperator = (num) ->num*2;
        int res = doubleOperator.apply(3);
        System.out.println("Result of Unary operator is: "+ res);
    }


    public static void main(String[] args) {
        bifunction();
        unaryOperator();
        binaryOperator();
        System.out.println("This is the output of Functional Interface: "+ new Bifunction().calculate(5));
    }

    @Override
    public int calculate(int x) {
        return x;
    }
}
