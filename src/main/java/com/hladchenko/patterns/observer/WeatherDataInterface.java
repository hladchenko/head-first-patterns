package com.hladchenko.patterns.observer;

public interface WeatherDataInterface {
    float getTemperature();

    float getHumidity();

    float getPressure();

    /**
     * This method gets called
     * whenever the weather measurements
     * have been updated
     *
     */
    void measurementsChanged();
}
