package com.example.decoratepattern;

import com.example.decoratepattern.abs.Beverage;
import com.example.decoratepattern.abs.CondimentDecorator;

/**
 * created by Sunday
 * on 2019-06-16 13:56
 */
public class Mocha extends CondimentDecorator {

    private Beverage mBeverage;

    public Mocha(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + mBeverage.cost();
    }
}
