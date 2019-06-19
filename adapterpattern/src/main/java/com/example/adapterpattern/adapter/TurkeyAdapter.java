package com.example.adapterpattern.adapter;

import com.example.adapterpattern.interf.Duck;
import com.example.adapterpattern.interf.Turkey;

/**
 * created by Sunday
 * on 2019-06-18 17:57
 */
public class TurkeyAdapter implements Duck {

    private Turkey mTurkey;

    public TurkeyAdapter(Turkey turkey) {
        mTurkey = turkey;
    }

    @Override
    public void quack() {
        mTurkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            mTurkey.fly();
        }
    }
}
