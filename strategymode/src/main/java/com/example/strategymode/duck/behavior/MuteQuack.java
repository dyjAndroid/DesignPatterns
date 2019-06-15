package com.example.strategymode.duck.behavior;

import android.util.Log;

import com.example.strategymode.duck.behavior.inter.QuackBehavior;

/**
 * created by Sunday
 * on 2019-06-15 19:53
 */
public class MuteQuack implements QuackBehavior {

    private static final String TAG = "Sunday";
    @Override
    public void quack() {
        Log.d(TAG,"安静...");
    }
}
