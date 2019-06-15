package com.example.strategymode.duck.behavior;

import android.util.Log;

import com.example.strategymode.duck.behavior.inter.QuackBehavior;

/**
 * created by Sunday
 * on 2019-06-15 19:52
 */
public class Squeak implements QuackBehavior {

    private static final String TAG = "Sunday";

    @Override
    public void quack() {
        Log.d(TAG, "吱吱叫...");
    }
}
