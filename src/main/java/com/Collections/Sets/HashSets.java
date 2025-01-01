package com.Collections.Sets;

import java.util.*;

/*
1. HashSet is a collection of unique elements that implements the Set interface.
2. It uses HashMap internally to ensure uniqueness.
3. It allows only one null value.
4. It is not thread safe, but we can make it thread safe externally.
5. It does not maintain insertion order.
6. O(1) is the complexity of its basic operations. Like add remove contains.
 */
public class HashSets {
    public static void main(String[] args) {
        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        set.add("One");
        set.add("Two");
        set.add("One");
        System.out.println(set.contains("One"));
        set.remove("Two");
        System.out.println(set.size());
        set.forEach(System.out::println);

    }
}
