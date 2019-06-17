package com.example.factorypattern;

import com.example.factorypattern.ingredient.PizzaIngredientFactory;
import com.example.factorypattern.ingredient.factory.NYPizzaIngredientFactory;
import com.example.factorypattern.pizza.CheesePizza;
import com.example.factorypattern.pizza.Pizza;

/**
 * created by Sunday
 * on 2019-06-16 15:39
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
