package com.example.statuspattern;

import com.example.statuspattern.intf.State;

/**
 * created by Sunday
 * on 2019-06-20 11:38
 */
public class SoldState implements State {

    private GumballMachine mGumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        mGumballMachine.releaseBall();
        if (mGumballMachine.getCount() > 0) {
            mGumballMachine.setState(mGumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            mGumballMachine.setState(mGumballMachine.getSoldOutState());
        }
    }
}
