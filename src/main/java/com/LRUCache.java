package com;

import java.util.HashMap;

/*
    Least Recently Used Cache
    1. stores key value pairs
    2. has a fixed capacity
    3. When the capacity is exceeded, it evicts the least recently used item.
    4. Everytime a key is used get() or put(), it considered as most recently used.


    Efficient Way:
    1. To get O(1) time complexity for both get() and put(), we use:
        a. HashMap — to store key → Node reference
        b. Doubly Linked List — to maintain usage order (head = most recent, tail = least recent)
 */
public class LRUCache {
    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private HashMap<Integer,Node> map;
    private Node head, tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node){
        // Detach from linked list
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertToFront(Node node){
        // Insert right after head
        node.next = head.next;
        node.prev = head;
        head.next.prev =  node;
        head.next = node;
    }


    public int get(int key){
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);
        insertToFront(node);
        return node.value;
    }

    public void put(int key, int value){
        if (map.containsKey(key)) remove(map.get(key));
        if (map.size() == capacity){
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }

        Node node = new Node(key,value);
        insertToFront(node);
        map.put(key,node);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));  // returns 1

        cache.put(3, 3); // evicts key 2
        System.out.println(cache.get(2));  // returns -1 (not found)

        cache.put(4, 4); // evicts key 1
        System.out.println(cache.get(1));  // returns -1 (not found)
        System.out.println(cache.get(3));  // returns 3
        System.out.println(cache.get(4));  // returns 4
    }
}
