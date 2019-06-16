package com.example.observerpattern.data;

import com.example.observerpattern.interf.Observer;
import com.example.observerpattern.interf.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Sunday
 * on 2019-06-16 11:52
 */
public class WeatherData implements Subject {

    private List<Observer> mObservers;
    private float mTemperature;
    private float mHumidity;
    private float mPressure;

    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = mObservers.indexOf(o);
        if (i >= 0) {
            mObservers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o :
                mObservers) {
            o.update(mTemperature, mHumidity, mPressure);
        }
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        mTemperature = temperature;
        mHumidity = humidity;
        mPressure = pressure;
        measurementsChanged();
    }
}
