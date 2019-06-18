package com.example.commandpattern.device;

/**
 * created by Sunday
 * on 2019-06-18 16:25
 */
public class Stereo {

    private String mName;

    public Stereo(String name) {
        mName = name;
    }

    public void on() {
        System.out.println(mName + " Stereo is On");
    }

    public void off() {
        System.out.println(mName + " Stereo is off");
    }

    public void setCd() {
        System.out.println(mName + " Stereo set Music CD");
    }

    public void setRadio() {
        System.out.println(mName + " Stereo set radio");
    }

    public void setVolume(int volume) {
        System.out.println(mName + " Stereo current volume:" + volume);
    }
}
