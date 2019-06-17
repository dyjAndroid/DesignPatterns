package com.example.factorypattern.pizza;

/**
 * created by Sunday
 * on 2019-06-17 09:36
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
    }

    @Override
    public void prepare() {

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
