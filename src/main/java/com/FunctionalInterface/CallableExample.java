package com.FunctionalInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
1. A Callable represents a task that can be executed by a thread, and it returns a result.
2. The call() method can return a result and can throw checked exceptions.
3. The result returned by call() is wrapped in a Future object, allowing you to retrieve the result once the task is complete.
 */
public class CallableExample {
    public static void main(String[] args) throws Exception {
        Callable<Integer> task = () -> {
            System.out.println("Task scheduled using Callable.");
            return 42;
        };

        FutureTask<Integer> futureTask = new FutureTask<>(task);

        Thread thread = new Thread(futureTask);
        thread.start();

        Integer res = futureTask.get();
        System.out.println("Result of callable: "+res);
    }
}
