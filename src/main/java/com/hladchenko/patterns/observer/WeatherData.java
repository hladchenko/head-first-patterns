package com.hladchenko.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherDataInterface, Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public float getTemperature() {
        return 0;
    }

    @Override
    public float getHumidity() {
        return 0;
    }

    @Override
    public float getPressure() {
        return 0;
    }

    @Override
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
