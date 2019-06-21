package com.example.compoundpattern.duck.intf;

/**
 * created by Sunday
 * on 2019-06-20 16:29
 */
public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
