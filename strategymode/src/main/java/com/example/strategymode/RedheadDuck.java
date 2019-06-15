package com.example.strategymode;

import android.util.Log;

/**
 * created by Sunday
 * on 2019-06-15 19:04
 */
public class RedheadDuck extends Duck {

    @Override
    void display() {
        Log.i(TAG,"I am a red head duck");
    }
}
