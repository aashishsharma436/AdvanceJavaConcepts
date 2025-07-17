package com.Singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadSafeSingletonEagerInitialization {
    private static final ThreadSafeSingletonEagerInitialization instance = new ThreadSafeSingletonEagerInitialization();
    private ThreadSafeSingletonEagerInitialization(){}
    public static ThreadSafeSingletonEagerInitialization getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("one", "two", "three"));
        items.remove("two"); // Throws UnsupportedOperationException
        System.out.println(items);
    }

}
