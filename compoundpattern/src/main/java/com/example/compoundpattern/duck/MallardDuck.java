package com.example.compoundpattern.duck;

import com.example.compoundpattern.duck.intf.Observer;
import com.example.compoundpattern.duck.intf.Quackable;

/**
 * created by Sunday
 * on 2019-06-20 15:23
 */
public class MallardDuck implements Quackable {

    private Observable mObservable;

    public MallardDuck() {
        mObservable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        mObservable.notifyObservers();
    }
}
