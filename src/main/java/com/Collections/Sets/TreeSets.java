package com.Collections.Sets;

import java.util.TreeSet;

public class TreeSets {
    /*
        1. TreeSet implements SortedSet interface, and it uses the red-black tree for storage.
        2. The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided.
        3. TreeSet does not allow duplicate elements. Any attempt to add a duplicate element will be ignored.
        4. It doesn’t allow null values and throws NullPointerException null element is inserted in it.
        5. TreeSet implements the NavigableSet interface and provides additional methods to navigate the set (e.g., higher(), lower(), ceiling(), and floor()).
        6. It is not thread safe. For concurrent access, it should be synchronized externally using Collections.synchronizedSet().
    */

    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> t = new TreeSet<>();
        t.add("name");
        t.add("alphabet");

        // Displaying the TreeSet (which is empty at this point)
        System.out.println("TreeSet elements: " + t);

        System.out.println(t.first()); // return first element

        System.out.println(t.last()); // return last element

        System.out.println(t.subSet("last","name"));


    }

}