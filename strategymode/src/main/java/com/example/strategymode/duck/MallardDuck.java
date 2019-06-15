package com.example.strategymode.duck;

import android.util.Log;

import com.example.strategymode.duck.behavior.FlyWithWings;
import com.example.strategymode.duck.behavior.Quack;

/**
 * created by Sunday
 * on 2019-06-15 19:02
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        mFlyBehavior = new FlyWithWings();
        mQuackBehavior = new Quack();
    }

    @Override
    void display() {
        Log.i(TAG,"I am a mallard duck");
    }
}
