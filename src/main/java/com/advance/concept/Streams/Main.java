package com.advance.concept.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*
    Stream API is used to process the collections of Objects.
    We can perform the operations like filtering, mapping, reducing and sorting the data by using streams

    Benefits of Stream
    -> No storage, Pipeline of functions, Laziness, Can be infinite, can be parallelized
    -> can be created from collections, arrays, Files Lines, Methods in stream


    There are two types of operations in streams
    1. Intermediate Operation
    2. Terminal Operation


    In Intermediate Operation:
        -> methods are chained together
        -> Intermediate operations transfer a stream into another stream
        -> It enables the concept of filtering where one method filters data and passes it to another method after processing

        Important Intermediate operations
        1. map(): This method is used to return a stream consisting of the results of applying the given function to the elements of this stream.
        2. filter(): This method is used to select elements as per the Predicate passed as an argument.
        3. Sorted(): This method sorts the stream
        4. flatMap(): This method is used to flatten a stream of collections into a single stream of elements
        5. distinct(): This method removes the duplicate elements. It returns a stream consisting of distinct elements.
        6. peek(): Performs an action on each element without modifying the stream. It returns a stream consisting of the elements of this stream,
                    additionally performing the provided action on each element as elements are consumed from the resulting stream.

     */
    public static void intermediateOperations(){
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection","Collection"," Stream"),
                Arrays.asList("Structure","State","Flow"),
                Arrays.asList("Sorting","Mapping","Reduction","Stream"));

        Set<String> intermediateResults = new HashSet<>();

        List<String> result = listOfLists.stream()
                .flatMap(List::stream)  // flatten the lists of lists into a single stream
                .filter(s -> s.startsWith("S")) //filter elements starting with "S"
                .map(String::toUpperCase)   //Transform each element to uppercase
                .distinct()     //Remove the duplicate elemets
                .sorted()       //Sort the elemets
                .peek(s-> intermediateResults.add(s))  // performs an action (add to set) on each element
                .collect(Collectors.toList());  //Collect the final result into a list

        System.out.print("IntermediateResults: ");
        intermediateResults.forEach(s-> System.out.print(s+" "));
        System.out.print("\nFinal Result: ");
        result.forEach(s-> System.out.print(s+" "));
    }

    /*
     In Terminal Operations: It is type of operations that return the result. These Operations are not processed further just return a final result value

     Important Terminal Operations
     1. collect(): This method is used to return the result of the intermediate operations performed on the stream.
     2. forEach(): This method is used to iterate through every element of the stream.
     3. reduce(): This method is used to reduce the elements of a stream to a single value. This reduce method takes BinaryOperator as a parameter.
     4. count(): Returns the count of elements in the stream
     5. findFirst(): Returns the first element of the stream.
     6. allMatch(): Checks if all elements of the stream match a given predicate.
     7. anyMatch(): Checks if any elements of the stream matches a given predicate.
     */

    public static void terminalOperations(){
        List<String> listOfLists = Arrays.asList("Reflection","Collection"," Stream");
        System.out.println("\nTotal Number of elements are: "+ listOfLists.stream().count()); // count function
        System.out.println("Words starts with S: "+ listOfLists.stream().anyMatch(s->s.startsWith("S")));
        String reduceRes = listOfLists.stream().reduce("Reduced Strings are: ",(pS,ele)->pS+" "+ele);
        System.out.println(reduceRes);// This will return a single string


    }
    public static void main(String[] args) {
        intermediateOperations();
        terminalOperations();
    }
}
