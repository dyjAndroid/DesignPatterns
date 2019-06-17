package com.example.factorypattern.pizza;

import com.example.factorypattern.ingredient.PizzaIngredientFactory;

/**
 * created by Sunday
 * on 2019-06-16 15:02
 */
public class ClamPizza extends Pizza {

    private PizzaIngredientFactory mPizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        mPizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + mName);
        mDough = mPizzaIngredientFactory.createDough();
        mSauce = mPizzaIngredientFactory.createSauce();
        mCheese = mPizzaIngredientFactory.createCheese();
        mClams = mPizzaIngredientFactory.createClams();
    }
}
