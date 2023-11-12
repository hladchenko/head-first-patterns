package com.hladchenko.patterns.observer.display;

import com.hladchenko.patterns.observer.Observer;

public class CurrentConditionsDisplay extends AbstractDisplay implements Observer {
    @Override
    public void update(float temp, float pressure, float humidity) {
        System.out.printf("CurrentConditionsDisplay notified with: %f %f %f%n", temp, pressure, humidity);
    }
}
