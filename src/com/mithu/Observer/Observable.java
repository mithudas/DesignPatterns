package com.mithu.Observer;

/**
 * Created by mithu on 1/6/18.
 */
public interface Observable {
     void registerObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObservers();
}
