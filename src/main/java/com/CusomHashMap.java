package com;

public class CusomHashMap {

    private static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;
    private Node[] buckets;

    public CusomHashMap(){
        buckets = new Node[SIZE];
    }

    private int hashKey(int key){
        return key%SIZE;
    }

    public void put(int key, int value){
        int index = hashKey(key);
        if(buckets[index] == null){
            buckets[index] = new Node(key,value);
        }
        else{
            Node curr = buckets[index];
            while (true){
                if (curr.key == key){
                    curr.value = value;
                    return;
                }
                if (curr.next == null) break;
                curr = curr.next;
            }
            curr.next = new Node(key,value);
        }
    }

    public int get(int key){
        int index = hashKey(key);
        Node curr = buckets[index];
        while (curr!=null){
            if(curr.key == key) return curr.value;
            curr =  curr.next;
        }
        return -1;
    }

    public void remove(int key){
        int index = hashKey(key);
        Node curr = buckets[index], prev = null;
        while (curr != null){
            if (curr.key == key){
                if (prev == null) buckets[index] = curr.next;
                else prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}



class Main {
    public static void main(String[] args) {
        CusomHashMap map = new CusomHashMap();
        map.put(1, 10);

        map.put(1,50);
        map.put(2, 20);
        map.put(1001, 30);  // Collides with key 1 if size = 1000

        System.out.println(map.get(1));    // Output: 10
        System.out.println(map.get(2));    // Output: 20
        System.out.println(map.get(1001)); // Output: 30

        map.remove(1);
        System.out.println(map.get(1));    // Output: -1 (not found)
    }
}
