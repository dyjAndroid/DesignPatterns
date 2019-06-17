package com.example.factorypattern;

import com.example.factorypattern.pizza.Pizza;

/**
 * created by Sunday
 * on 2019-06-16 15:20
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
