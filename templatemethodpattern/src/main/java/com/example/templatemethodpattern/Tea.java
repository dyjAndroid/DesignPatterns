package com.example.templatemethodpattern;

/**
 * created by Sunday
 * on 2019-06-19 10:56
 */
public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
