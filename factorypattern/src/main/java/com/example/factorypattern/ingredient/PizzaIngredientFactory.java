package com.example.factorypattern.ingredient;

/**
 * created by Sunday
 * on 2019-06-17 11:51
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
