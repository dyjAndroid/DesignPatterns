package com.example.singletonpattern;

/**
 * created by Sunday
 * on 2019-06-18 09:46
 */
public class Singleton {

    private static Singleton mInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }
}
