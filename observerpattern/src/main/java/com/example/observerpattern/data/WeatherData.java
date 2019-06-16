package com.example.observerpattern.data;

import java.util.Observable;

/**
 * created by Sunday
 * on 2019-06-16 11:52
 */
public class WeatherData extends Observable {

    private float mTemperature;
    private float mHumidity;
    private float mPressure;


    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        mTemperature = temperature;
        mHumidity = humidity;
        mPressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return mTemperature;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public float getPressure() {
        return mPressure;
    }
}
