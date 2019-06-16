package com.example.observerpattern;

import com.example.observerpattern.data.WeatherData;
import com.example.observerpattern.display.CurrentConditionsDisplay;

/**
 * created by Sunday
 * on 2019-06-16 12:08
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80.0f,65.0f,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }

}
