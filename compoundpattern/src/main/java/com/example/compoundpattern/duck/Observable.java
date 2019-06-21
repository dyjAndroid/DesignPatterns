package com.example.compoundpattern.duck;

import com.example.compoundpattern.duck.intf.Observer;
import com.example.compoundpattern.duck.intf.QuackObservable;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Sunday
 * on 2019-06-20 16:39
 */
public class Observable implements QuackObservable {

    private List<Observer> mObservers = new ArrayList<>();

    private QuackObservable mDuck;

    public Observable(QuackObservable duck) {
        mDuck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : mObservers) {
            observer.update(mDuck);
        }
    }
}
