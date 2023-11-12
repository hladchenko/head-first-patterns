package com.hladchenko.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements WeatherDataInterface, Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void measurementsChanged(float newTemperature, float newHumidity, float newPressure) {
        notifyObservers(newTemperature, newHumidity, newPressure);
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
    public void notifyObservers(float newTemperature, float newHumidity, float newPressure) {
        for (Observer observer : observers) {
            observer.update(newTemperature, newPressure, newHumidity);
        }
    }


}
