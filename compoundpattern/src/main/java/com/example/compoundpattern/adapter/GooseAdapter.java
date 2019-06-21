package com.example.compoundpattern.adapter;

import com.example.compoundpattern.duck.intf.Observer;
import com.example.compoundpattern.duck.intf.Quackable;
import com.example.compoundpattern.goose.Goose;

/**
 * created by Sunday
 * on 2019-06-20 15:39
 */
public class GooseAdapter implements Quackable {

    private Goose mGoose;

    public GooseAdapter(Goose goose) {
        mGoose = goose;
    }

    @Override
    public void quack() {
        mGoose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
