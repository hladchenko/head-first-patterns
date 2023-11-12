package com.hladchenko.patterns.observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(float newTemperature, float newHumidity, float newPressure);
}
