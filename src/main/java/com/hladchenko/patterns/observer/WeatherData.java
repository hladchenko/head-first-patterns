package com.hladchenko.patterns.observer;

public interface WeatherData {
    int getTemperature();

    int getHumidity();

    int getPressure();

    /**
     * This method gets called
     * whenever the weather measurements
     * have been updated
     *
     */
    void measurementsChanged();
}
