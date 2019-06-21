package com.example.compoundpattern.duck;

import com.example.compoundpattern.duck.intf.Quackable;

/**
 * created by Sunday
 * on 2019-06-20 15:55
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();

}
