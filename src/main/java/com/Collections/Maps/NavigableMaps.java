package com.Collections.Maps;

import java.util.*;
public class NavigableMaps {
    /*
    1. It is an extension of SortedMap, which provides convenient navigation methods like lowerKey, floorKey, ceilingKey, and higherKey and along with its popular navigation Method.
    2. It also provides ways to create a SubMap from existing Map
     */

    public static void main(String[] args) {
        NavigableMap<String, Integer> nm
                = new TreeMap<String, Integer>();

        // Add elements using put() method
        nm.put("C", 888);
        nm.put("Y", 999);
        nm.put("A", 444);
        nm.put("T", 555);
        nm.put("B", 666);
        nm.put("A", 555);

        System.out.println("Mappings of NavigableMap : " + nm);

        System.out.printf("Descending Set  : %s%n", nm.descendingKeySet());     // provides the descending key set

        //return a key-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key
        System.out.printf("Floor Entry  : %s%n", nm.floorEntry("L"));

        //returns the first element of map
        System.out.printf("First Entry  : %s%n", nm.firstEntry());

        //return the last key of the map
        System.out.printf("Last Key : %s%n", nm.lastKey());

        //returns the first key of the map
        System.out.printf("First Key : %s%n", nm.firstKey());

        //return the complete map
        System.out.printf("Original Map : %s%n", nm);

        //return the map the descending order
        System.out.printf("Reverse Map : %s%n", nm.descendingMap());

        //Traversing the Map

        for (Map.Entry<String,Integer> e: nm.entrySet()){
            System.out.println(e.getKey()+","+e.getValue());
        }

        //Travesing in other Way

        Iterator<Map.Entry<String,Integer>> itr = nm.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,Integer> e = itr.next();
            System.out.println(e.getKey()+","+e.getValue());
        }
    }
}
