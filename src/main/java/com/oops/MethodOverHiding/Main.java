package com.oops.MethodOverHiding;

class A{
    public static void test(){
        System.out.println("Class A");
    }
}

class B extends A{
    //this method is not override because static methods can not be overridden
    public static void test(){
        System.out.println("Class B");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        a.test();
        b.test();
        //Output is Class A
        //Class A
    }
}
