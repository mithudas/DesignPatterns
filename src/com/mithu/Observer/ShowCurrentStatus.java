package com.mithu.Observer;

/**
 * Created by mithu on 1/6/18.
 */
public class ShowCurrentStatus implements Observer,Display {
    private Float temperature;
    private Observable observable;

    public ShowCurrentStatus(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void update(Observable observable) {
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature =weatherData.getTemperature();
        }
        show();
    }

    public void show() {
        System.out.println("\n Showing current Status");
        System.out.println("temperature" + temperature);
    }


}
