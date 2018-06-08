package com.mithu.Observer;

/**
 * Created by mithu on 1/6/18.
 */
public class App {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ShowCurrentStatus showCurrentStatus =  new ShowCurrentStatus(weatherData);
        Stats stats = new Stats(weatherData);

        weatherData.setMeasurements(10.00F,20.00F);
        weatherData.setMeasurements(100.00F,200.00F);
    }
}
