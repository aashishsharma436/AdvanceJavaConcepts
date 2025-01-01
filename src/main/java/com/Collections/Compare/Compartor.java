package com.Collections.Compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class User{
    private String name;
    private int rollNo;

    public User(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() { return name;}
    public int getRollNo() { return rollNo;}

    public void setName(String name) { this.name = name; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo;}
}

class Sortbyname implements Comparator<User> {
    @Override
    public int compare(User a, User b) {
        return a.getName().compareTo(b.getName());
    }
}
class Sortbyroll implements Comparator<User> {
    @Override
    public int compare(User a, User b) {
        return a.getRollNo() - b.getRollNo();
    }
}


public class Compartor {

    public static void main(String[] args){
        List<User> list = new ArrayList(Arrays.asList(new User("ABCD",2),new User("DEFG",1)));
        list.stream().sorted(new Sortbyroll());
        list.forEach(e->{
            System.out.println(e.getName());
        });

        list.stream().sorted(new Sortbyname());
        list.forEach(e-> System.out.println(e.getRollNo()));

    }
}
