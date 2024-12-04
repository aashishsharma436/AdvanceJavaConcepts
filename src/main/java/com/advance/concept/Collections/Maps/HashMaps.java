package com.advance.concept.Collections.Maps;

import java.util.*;

public class HashMaps {
    /*
    HashMap
    -> It is a part of java Collection framework. it uses a technique called hashing. It implements the map interface.
    -> It stores the data in the pair of key and value
    -> HashMap contains an array of nodes where nodes represent the class.
    -> It uses array and LinkList to store the data internally for storing key and value.
    -> There are four fields in HashMap
        1. int hash
        2. K key
        3. V value
        4. Node<K,V> next

     Working:
     1. equals():   It checks the equality of two objects. It compares the key whether they are equal or not. It is the method of
                    object class. It can be overridden, if you override the equals() method then it is mandatory to override the
                    hashcode() method
     2. hashCode(): This is the method of Object class. It returns the memory reference of the object in the integer form. The value
                    received from this method is used as the bucket number. The bucket number is the address of the element inside the
                    map. HashCode of null key is 0.

      Characteristics of HashMap
      1. Fast Access time: It provides the constant time O(1) from insertion and retrieval
      2. Uses Hashing function: It uses hash function to map keys to indices in an array. This allows for a quick lookup of values based on keys.
      3. Thread Unsafe: HashMaps are not thread-safe. If thread safety is required then ConcurrentHashMap can be used.
      4. Capacity and load Factor: It has a capacity, which is the number of elements that it can hold, and a load factor, which is
                                    the measure of how full the hashmap can be before it is resized.
      5. Not ordered:   HashMaps are not ordered, which means that the order of insertion is not maintained. However, LinkedHashMap preserves
                        the insertion order.

       Java HashMap Constructors
       1. HashMap()
       2. HashMap(int initialCapacity)  new HashMap<>(10);
       3. HashMap(int initialCapacity, float loadFactor)    new HashMap<>(5,0.75f);
       4. HashMap(Map map) new HashMap<>(new HashMap<>());
     */

    public static void main(String[] args) {
        Map<Integer,String> hm1 = new HashMap<>();
        hm1.put(1,"one");
        hm1.put(2,"two");
        hm1.put(3,"three");
        // all ways to define the constructor of hashmap
        Map<Integer,String> hm2 = new HashMap<>(hm1);
        Map<Integer,String> hm3 = new HashMap<>(10,0.75f);
        Map<Integer,String> hm4 = new HashMap<>(10);
        System.out.println(hm2);

        // Traversal of HashMap
        for (Map.Entry<Integer,String> e: hm2.entrySet()){
            System.out.println("Key: "+e.getKey() + " Value: "+ e.getValue());
        }
        //get keySet
        System.out.println(hm2.keySet());

        //Returns set view of mapping contained in the map
        System.out.println(hm2.entrySet());

        //Returns the values contained in the map
        System.out.println(hm2.values());
    }
}
