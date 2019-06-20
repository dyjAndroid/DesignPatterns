package com.example.statuspattern.intf;

/**
 * created by Sunday
 * on 2019-06-20 11:10
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
