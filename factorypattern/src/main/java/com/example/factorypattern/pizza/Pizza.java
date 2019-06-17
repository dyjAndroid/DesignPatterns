package com.example.factorypattern.pizza;

import com.example.factorypattern.ingredient.Cheese;
import com.example.factorypattern.ingredient.Clams;
import com.example.factorypattern.ingredient.Dough;
import com.example.factorypattern.ingredient.Sauce;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Sunday
 * on 2019-06-16 14:57
 */
public abstract class Pizza {

    protected String mName;
    protected Dough mDough;
    protected Sauce mSauce;
    protected Cheese mCheese;
    protected Clams mClams;

    protected List<String> mToppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "mName='" + mName + '\'' +
                ", mDough='" + mDough + '\'' +
                ", mSauce='" + mSauce + '\'' +
                ", mToppings=" + mToppings +
                '}';
    }
}
