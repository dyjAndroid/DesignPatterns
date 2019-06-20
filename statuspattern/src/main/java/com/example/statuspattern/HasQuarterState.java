package com.example.statuspattern;

import com.example.statuspattern.intf.State;

/**
 * created by Sunday
 * on 2019-06-20 11:38
 */
public class HasQuarterState implements State {

    private GumballMachine mGumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        mGumballMachine.setState(mGumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        mGumballMachine.setState(mGumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
