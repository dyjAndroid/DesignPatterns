package com.example.strategymode;

import android.util.Log;

/**
 * created by Sunday
 * on 2019-06-15 19:02
 */
public class MallardDuck extends Duck {


    @Override
    void display() {
        Log.i(TAG,"I am a mallard duck");
    }
}
