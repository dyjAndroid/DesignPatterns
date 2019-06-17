package com.example.factorypattern.ingredient.factory;

import com.example.factorypattern.ingredient.Cheese;
import com.example.factorypattern.ingredient.Clams;
import com.example.factorypattern.ingredient.Dough;
import com.example.factorypattern.ingredient.FreshClams;
import com.example.factorypattern.ingredient.Garlic;
import com.example.factorypattern.ingredient.MarinaraSauce;
import com.example.factorypattern.ingredient.Mushroom;
import com.example.factorypattern.ingredient.Onion;
import com.example.factorypattern.ingredient.Pepperoni;
import com.example.factorypattern.ingredient.PizzaIngredientFactory;
import com.example.factorypattern.ingredient.RedPepper;
import com.example.factorypattern.ingredient.ReggianoCheese;
import com.example.factorypattern.ingredient.Sauce;
import com.example.factorypattern.ingredient.SlicedPapperoni;
import com.example.factorypattern.ingredient.ThinCrustDough;
import com.example.factorypattern.ingredient.Veggies;

/**
 * created by Sunday
 * on 2019-06-17 11:57
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPapperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
