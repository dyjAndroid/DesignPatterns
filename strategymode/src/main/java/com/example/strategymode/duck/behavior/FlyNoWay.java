package com.example.strategymode.duck.behavior;

import android.util.Log;

import com.example.strategymode.duck.behavior.inter.FlyBehavior;

/**
 * created by Sunday
 * on 2019-06-15 19:44
 */
public class FlyNoWay implements FlyBehavior {

    private static final String TAG = "Sunday";
    @Override
    public void fly() {
        Log.d(TAG,"I can not fly");
    }
}
