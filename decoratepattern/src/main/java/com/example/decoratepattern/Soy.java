package com.example.decoratepattern;

import com.example.decoratepattern.abs.Beverage;
import com.example.decoratepattern.abs.CondimentDecorator;

/**
 * created by Sunday
 * on 2019-06-16 14:07
 */
public class Soy extends CondimentDecorator {

    private Beverage mBeverage;

    public Soy(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return 0.50 + mBeverage.cost();
    }
}
