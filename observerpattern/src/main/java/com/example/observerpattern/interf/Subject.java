package com.example.observerpattern.interf;

/**
 * created by Sunday
 * on 2019-06-16 11:47
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
