package com.FunctionalInterface;

/*
1. A Runnable represents a task that can be executed asynchronously by a thread.
2. It does not return any result and does not throw any checked exceptions.
3. The run() method is void and cannot return anything.
 */
public class RunnableExample {
    public static void main(String[] args) {
        Runnable taks = ()->{
            System.out.println("This is runnable example");
        };

        Thread thread = new Thread(taks);
        thread.start();
    }
}
