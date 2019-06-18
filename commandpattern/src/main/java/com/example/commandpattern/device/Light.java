package com.example.commandpattern.device;

/**
 * created by Sunday
 * on 2019-06-18 14:43
 */
public class Light {

    private String mName = "";

    public Light() {
    }

    public Light(String name) {
        mName = name;
    }

    public void on() {
        System.out.println(mName + " Light is On");
    }

    public void off() {
        System.out.println(mName + " Light is off");
    }
}
