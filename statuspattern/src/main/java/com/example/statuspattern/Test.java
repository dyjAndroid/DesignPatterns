package com.example.statuspattern;

/**
 * created by Sunday
 * on 2019-06-20 10:33
 * 状态模式：允许对象在内部状态改变时改变它的行为，对象看起来就好像修改了它的类。
 */
public class Test {

    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

    }
}
