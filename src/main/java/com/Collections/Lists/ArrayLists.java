package com.Collections.Lists;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        //filter
        System.out.println(list.stream().filter(e-> e%2 == 0) .collect(Collectors.toList()));

        //map
        System.out.println(list.stream().map(n-> n*n).collect(Collectors.toList()));

        //flatMap
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        List<Integer> flatList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);

        //limit
        System.out.println(list.stream().limit(5).collect(Collectors.toList()));

        //skip
        System.out.println(list.stream().skip(5).collect(Collectors.toList()));

        //peek: It performs the action without consuming the stream
        list.stream().peek(n-> System.out.println(n)).collect(Collectors.toList());

        //merge two lists and sorted them in reverse order
        System.out.println(
                Stream.concat(list.stream(), nestedList.stream().flatMap(List::stream))
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList()));

        //or
        System.out.println(
                Stream.of(list.stream(),nestedList.stream().flatMap(List::stream))
                        .flatMap(s->s)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())

        );

        //Terminal Operations

        //findAny
        System.out.println(list.stream().findAny().orElse(-1));

        //noneMatch
        System.out.println(list.stream().noneMatch(n->n < 0));

        //all match
        System.out.println(list.stream().allMatch(n->n%2==0));

        //anyMatch
        System.out.println(list.stream().anyMatch(n->n%2==0));

        //minElement
        System.out.println(list.stream().min(Integer::compareTo).orElse(-1));

        //MaxElement
        System.out.println(list.stream().max(Integer::compareTo).orElse(-1));

        //reduce: Combine all elements to a single result
        System.out.println(list.stream().reduce(0,Integer::sum)); // Gives the sum of arraylist

    }
}
