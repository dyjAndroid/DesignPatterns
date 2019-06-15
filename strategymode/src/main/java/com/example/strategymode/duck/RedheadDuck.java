package com.example.strategymode.duck;

import android.util.Log;

import com.example.strategymode.duck.behavior.FlyWithWings;
import com.example.strategymode.duck.behavior.Quack;

/**
 * created by Sunday
 * on 2019-06-15 19:04
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        mFlyBehavior = new FlyWithWings();
        mQuackBehavior = new Quack();
    }

    @Override
    void display() {
        Log.i(TAG,"I am a red head duck");
    }
}
