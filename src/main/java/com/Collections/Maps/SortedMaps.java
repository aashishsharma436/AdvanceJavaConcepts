package com.Collections.Maps;

import java.util.*;
public class SortedMaps {

    /*
    1. This interface extends Map interface and provide a total oredring of its elements
    2. Diff. between SortedMap and Map is that the elements in a SortedMap are stored in a sorted order, whereas in a Map elements are stored in arbitrary order.
    3. The Sorting Order is determined by the natural Order of the Keys, which must implement the Comparable interface, or by Comparator passed to the SortedMap.
    4. Null key and null values are not permitted.
    5. The keys are in natural sorting order by specified comparator
     */
    public static void main(String[] args) {
        SortedMap<String,Integer> sortedMap = new TreeMap<>();
        sortedMap.put("B",1);
        sortedMap.put("A",2);
        sortedMap.put("C",3);
        System.out.println(sortedMap);
    }
}
