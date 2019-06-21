package com.example.compoundpattern.duck;

import com.example.compoundpattern.duck.intf.Observer;
import com.example.compoundpattern.duck.intf.QuackObservable;

/**
 * created by Sunday
 * on 2019-06-20 16:48
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist：" + duck + " just quacked.");
    }
}
