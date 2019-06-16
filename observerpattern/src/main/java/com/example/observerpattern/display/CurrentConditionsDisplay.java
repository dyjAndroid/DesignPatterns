package com.example.observerpattern.display;

import com.example.observerpattern.data.WeatherData;
import com.example.observerpattern.interf.DisplayElement;
import com.example.observerpattern.interf.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * created by Sunday
 * on 2019-06-16 12:00
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private final static String TAG = "Sunday";

    private Observable mWeatherData;
    private float mTemperature;
    private float mHumidity;

    public CurrentConditionsDisplay(Observable weatherData) {
        mWeatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
//        Log.d(TAG, "Current conditions: " + mTemperature + "F degrees and " +
//                mHumidity + "% humidity");
        System.out.println("Current conditions: " + mTemperature + "F degrees and " +
                mHumidity + "% humidity");
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            mTemperature = weatherData.getTemperature();
            mHumidity = weatherData.getHumidity();
            display();
        }
    }
}
