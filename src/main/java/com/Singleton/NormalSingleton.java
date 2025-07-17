package com.Singleton;

public class NormalSingleton {
    private static NormalSingleton instance;

    private NormalSingleton(){}

    public static NormalSingleton getInstance(){
        if (instance == null) instance = new NormalSingleton();
        return instance;
    }
}
