package com.example.strategymode.duck;

import android.util.Log;

import com.example.strategymode.duck.behavior.inter.FlyBehavior;
import com.example.strategymode.duck.behavior.inter.QuackBehavior;

/**
 * created by Sunday
 * on 2019-06-15 19:00
 */
public abstract class Duck {

    static final String TAG = "Sunday";

    QuackBehavior mQuackBehavior;

    FlyBehavior mFlyBehavior;

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    void swim() {
        Log.d(TAG, "swimming...");
    }

    public void performFly() {
        mFlyBehavior.fly();
    }

    abstract void display();
}
