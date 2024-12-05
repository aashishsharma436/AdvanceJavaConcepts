package com.Collections;

import java.util.Comparator;
import java.util.TreeMap;


class Student implements Comparator<Student>{
    private String name;
    private int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {return this.rollNo;}
    public String getName() {return  this.name;}

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNo() - o2.getRollNo();
    }
}


public class TreeMaps {
    /*
        1.  Tree map does not contain or allow null key and thus a NullPointerException is thrown, but null value can be associated
            with keys.
        2.  Tree map is not synchronised, but we can synchronised it externally
        3.  TreeMap is based on RedBlack Tree data Structure.
        4.  Each node in the tree has:
            -> 3 variables (key, values, boolean colour)
            -> 3 references (Entry left, Entry right, Entry parent)
        5. We can create TreeMap by following constructors
            -> TreeMap<>();
            -> TreeMap<>(Comparator comp);
            -> TreeMap<>(Map map);
            -> TreeMap<>(SortedMap map);
     */

    public static void main(String[] args) {
        TreeMap<Integer,Integer> tm1 = new TreeMap<>();
        TreeMap<Student,Integer> tm2 = new TreeMap<>(new Student("name",2));
        tm2.put(new Student("name",3),1);
        tm2.put(new Student("name",1),2);

        tm2.forEach((e,f)->{
            System.out.println(e.getName() + " Id: "+e.getRollNo()+" Key: "+f);
        });
    }
}
