package com.example.adapterpattern;

import com.example.adapterpattern.interf.Duck;

/**
 * created by Sunday
 * on 2019-06-18 17:52
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
