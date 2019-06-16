package com.example.decoratepattern;

import com.example.decoratepattern.abs.Beverage;

/**
 * created by Sunday
 * on 2019-06-16 13:54
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        mDescription = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
