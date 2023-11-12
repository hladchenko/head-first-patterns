package com.hladchenko.patterns.observer.display;

import com.hladchenko.patterns.observer.Observer;

public class StatisticsDisplay extends AbstractDisplay implements Observer {
    @Override
    public void update(float temp, float pressure, float humidity) {
        System.out.printf("StatisticsDisplay notified with: %f %f %f%n", temp, pressure, humidity);
    }

    @Override
    public void display() {

    }
}
