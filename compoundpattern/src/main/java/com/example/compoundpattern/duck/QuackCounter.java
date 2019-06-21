package com.example.compoundpattern.duck;

import com.example.compoundpattern.duck.intf.Observer;
import com.example.compoundpattern.duck.intf.Quackable;

/**
 * created by Sunday
 * on 2019-06-20 15:44
 */
public class QuackCounter implements Quackable {

    private static int mNumberOfQuacks;

    private Quackable mDuck;

    public QuackCounter(Quackable duck) {
        mDuck = duck;
    }

    @Override
    public void quack() {
        mDuck.quack();
        mNumberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return mNumberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        mDuck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        mDuck.notifyObservers();
    }
}
