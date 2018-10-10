package com.sergeev.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class MeteoStation implements Observed{
    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();
    public void setMeasurements(int t, int p){
        temperature = t;
        pressure = p;
        notifyObservers();
    }
    public void addObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for(Observer o: observers){
            o.handleEvent(temperature, pressure);
        }
    }
}
