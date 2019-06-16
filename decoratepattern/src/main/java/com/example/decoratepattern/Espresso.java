package com.example.decoratepattern;

import com.example.decoratepattern.abs.Beverage;

/**
 * created by Sunday
 * on 2019-06-16 13:53
 */
public class Espresso extends Beverage {

    public Espresso() {
        mDescription = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
