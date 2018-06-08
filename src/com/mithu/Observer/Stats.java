package com.mithu.Observer;

/**
 * Created by mithu on 1/6/18.
 */
public class Stats implements Observer, Display {
    private Float temparature;
    private Float humidity;
    private Observable observable;

    public Stats(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void show() {
        System.out.println("\n");
        System.out.println("Showing current stats");
        System.out.println("Temparature" + temparature);
        System.out.println("Humidity" + humidity);
    }

    @Override
    public void update(Observable observable) {
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temparature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
        }
        show();
    }
}
