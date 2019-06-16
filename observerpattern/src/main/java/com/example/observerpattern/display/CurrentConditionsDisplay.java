package com.example.observerpattern.display;

import android.util.Log;

import com.example.observerpattern.interf.DisplayElement;
import com.example.observerpattern.interf.Observer;
import com.example.observerpattern.interf.Subject;

/**
 * created by Sunday
 * on 2019-06-16 12:00
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private final static String TAG = "Sunday";

    private Subject mWeatherData;
    private float mTemperature;
    private float mHumidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        mWeatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
//        Log.d(TAG, "Current conditions: " + mTemperature + "F degrees and " +
//                mHumidity + "% humidity");
        System.out.println("Current conditions: " + mTemperature + "F degrees and " +
                mHumidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        mTemperature = temp;
        mHumidity = humidity;
        display();
    }
}
