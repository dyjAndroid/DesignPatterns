package com.example.compoundpattern.duck;

import com.example.compoundpattern.duck.intf.Observer;
import com.example.compoundpattern.duck.intf.Quackable;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Sunday
 * on 2019-06-20 16:13
 */
public class Flock implements Quackable {

    private List<Quackable> mQuacks = new ArrayList<>();

    public void add(Quackable quaker) {
        mQuacks.add(quaker);
    }

    @Override
    public void quack() {
        for (Quackable quackery : mQuacks) {
            quackery.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quackery :
                mQuacks) {
            quackery.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Quackable quackery :
                mQuacks) {
            quackery.notifyObservers();
        }
    }
}
