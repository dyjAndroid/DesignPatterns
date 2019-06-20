package com.example.statuspattern;

import com.example.statuspattern.intf.State;

/**
 * created by Sunday
 * on 2019-06-20 10:34
 */
public class GumballMachine {

    private State mSoldOutState;
    private State mNoQuarterState;
    private State mHasQuarterState;
    private State mSoldState;

    private State mState = mSoldOutState;
    private int mCount;

    public GumballMachine(int numberGumballs) {
        mCount = numberGumballs;
        mSoldOutState = new SoldOutState(this);
        mNoQuarterState = new NoQuarterState(this);
        mHasQuarterState = new HasQuarterState(this);
        mSoldState = new SoldOutState(this);
        if (mCount > 0) {
            mState = mNoQuarterState;
        }
    }

    public void insertQuarter() {
        mState.insertQuarter();
    }

    public void ejectQuarter() {
        mState.ejectQuarter();
    }

    public void turnCrank() {
        mState.turnCrank();
    }

    public void dispense() {
        mState.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (mCount != 0) {
            mCount = mCount - 1;
        }
    }

    public State getSoldOutState() {
        return mSoldOutState;
    }

    public State getNoQuarterState() {
        return mNoQuarterState;
    }

    public State getHasQuarterState() {
        return mHasQuarterState;
    }

    public State getSoldState() {
        return mSoldState;
    }

    public int getCount() {
        return mCount;
    }

    public void setState(State state) {
        mState = state;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "mState=" + mState +
                ", mCount=" + mCount +
                '}';
    }
}
