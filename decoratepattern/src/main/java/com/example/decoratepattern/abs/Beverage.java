package com.example.decoratepattern.abs;

/**
 * created by Sunday
 * on 2019-06-16 13:48
 */
public abstract class Beverage {

    protected  String mDescription = "Unknown Beverage";

    public String getDescription() {
        return mDescription;
    }

    public abstract double cost();
}
