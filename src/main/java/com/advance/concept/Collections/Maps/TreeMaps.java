package com.advance.concept.Collections.Maps;

import java.util.*;
public class TreeMaps {
    /*
    1. TreeMap is used to implement Map interface and Navigable Map along with the AbstractMap class.
    2. This Map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used.
    3. This proves to be an efficient way of sorting and storing the key-value pairs.
    4. The storing order maintained by the treemap must be consistent with equals just like any other sorted maps
    5. The TreeMap implementation is not Synchronized, but it can be synchronized externally
    6. It does not allow the null keys in it.

     */
    static void Example1stConstructor()
    {
        // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(); // O(1)

        // Mapping string values to int keys using put()
        // method
        tree_map.put(10, "I"); // O(log n)
        tree_map.put(15, "4"); // O(log n)
        tree_map.put(20, "Geeks"); // O(log n)
        tree_map.put(25, "Welcomes"); // O(log n)
        tree_map.put(30, "You"); // O(log n)

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map); // O(n)
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        System.out.println("TreeMap using TreeMap() constructor:\n");

        // Calling constructor
        Example1stConstructor(); // O(n log n) for put and
        // O(n) for printing
    }
}
