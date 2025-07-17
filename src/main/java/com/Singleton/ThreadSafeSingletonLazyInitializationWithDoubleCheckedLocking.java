package com.Singleton;

public class ThreadSafeSingletonLazyInitializationWithDoubleCheckedLocking {
    private static volatile ThreadSafeSingletonLazyInitializationWithDoubleCheckedLocking instance;

    private ThreadSafeSingletonLazyInitializationWithDoubleCheckedLocking(){}

    public static ThreadSafeSingletonLazyInitializationWithDoubleCheckedLocking getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingletonLazyInitializationWithDoubleCheckedLocking.class){
                if (instance == null) instance = new ThreadSafeSingletonLazyInitializationWithDoubleCheckedLocking();
            }
        }
        return instance;
    }
}
