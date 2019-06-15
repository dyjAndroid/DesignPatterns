package com.example.strategymode;

import android.util.Log;

/**
 * created by Sunday
 * on 2019-06-15 19:08
 */
public class RubberDuck extends Duck {

    @Override
    void display() {
        Log.d(TAG,"I am a rubber duck");
    }

    @Override
    void quack() {
        Log.d(TAG,"吱吱叫...");
    }
}
