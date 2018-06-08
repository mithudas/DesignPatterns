package com.mithu.Observer;

import java.util.ArrayList;

/**
 * Created by mithu on 1/6/18.
 */
public class WeatherData implements Observable {
    private Float temperature;
    private Float humidity;
    ArrayList<Observer> observers= new ArrayList<>();

    public Float getTemperature() {
        return temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

   
    @Override
     public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
     public void removeObserver(Observer observer) {
        int indexOfObserver = observers.indexOf(observer);
        if (indexOfObserver >= 0) {
            observers.remove(observer);
        }
    }

    @Override
     public void notifyObservers() {
       for(Observer observer: observers){
           observer.update(this);
       }
    }

    private void measurementChanged(){
        this.notifyObservers();
    }
    
    public void setMeasurements( Float newTemparature, Float newHumidity){
        this.temperature =  newTemparature;
        this.humidity = newHumidity;
        measurementChanged();
    }


}
