package com.hladchenko.patterns.observer;

public interface Observer {
    void update(float temp, float pressure, float humidity);
}