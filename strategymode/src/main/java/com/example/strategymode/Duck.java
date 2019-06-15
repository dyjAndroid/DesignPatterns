package com.example.strategymode;

import android.util.Log;

/**
 * created by Sunday
 * on 2019-06-15 19:00
 */
public abstract class Duck {

    protected static final String TAG = "dyj";

    void quack() {
        Log.d(TAG, "呱呱叫...");
    }

    void swim() {
        Log.d(TAG, "swimming...");
    }

    void fly(){
        Log.d(TAG,"flying...");
    }

    abstract void display();
}
