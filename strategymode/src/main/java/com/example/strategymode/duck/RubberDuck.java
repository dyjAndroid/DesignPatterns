package com.example.strategymode.duck;

import android.util.Log;

import com.example.strategymode.duck.behavior.FlyNoWay;
import com.example.strategymode.duck.behavior.Squeak;

/**
 * created by Sunday
 * on 2019-06-15 19:08
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new Squeak();
    }

    @Override
    void display() {
        Log.d(TAG,"I am a rubber duck");
    }

}
