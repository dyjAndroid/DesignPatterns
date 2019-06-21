package com.example.compoundpattern;

import com.example.compoundpattern.adapter.GooseAdapter;
import com.example.compoundpattern.duck.AbstractDuckFactory;
import com.example.compoundpattern.duck.CountingDuckFactory;
import com.example.compoundpattern.duck.DuckCall;
import com.example.compoundpattern.duck.Flock;
import com.example.compoundpattern.duck.MallardDuck;
import com.example.compoundpattern.duck.Quackologist;
import com.example.compoundpattern.duck.RedheadDuck;
import com.example.compoundpattern.duck.RubberDuck;
import com.example.compoundpattern.duck.intf.Quackable;
import com.example.compoundpattern.goose.Goose;
import com.example.compoundpattern.duck.QuackCounter;

/**
 * created by Sunday
 * on 2019-06-20 15:27
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
//        duckSimulator.simulate();

        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator：With Composite - Flocks");
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator：With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("\nDuck Simulator：Whole Flock Simulator");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator：Mallard Flock Simulator");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");

    }
    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
