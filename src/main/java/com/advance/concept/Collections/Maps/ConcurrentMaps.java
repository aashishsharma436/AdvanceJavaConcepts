package com.advance.concept.Collections.Maps;

import java.util.concurrent.*;

public class ConcurrentMaps {
    /*
        1. It's similar to Map, but it's a thread safe map, also known as synchronised map
     */

    public static void main(String[] args) {
        ConcurrentMap<Integer, String> m = new ConcurrentHashMap<>();
        m.put(100, "Geeks");
        m.put(101, "For");
        m.put(102, "Geeks");

        // Here we cant add Hello because 101 key
        // is already present
        m.putIfAbsent(101, "Hello");

        // We can remove entry because 101 key
        // is associated with For value
        m.remove(101, "For");

        // Now we can add Hello
        m.putIfAbsent(101, "Hello");

        // We can replace Hello with For
        m.replace(101, "Hello", "For");
        System.out.println("Map contents : " + m);
    }
}
