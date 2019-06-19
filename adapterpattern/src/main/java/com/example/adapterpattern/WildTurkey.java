package com.example.adapterpattern;

import com.example.adapterpattern.interf.Turkey;

/**
 * created by Sunday
 * on 2019-06-18 17:54
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
