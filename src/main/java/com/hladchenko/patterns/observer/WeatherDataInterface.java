package com.hladchenko.patterns.observer;

public interface WeatherDataInterface {

    /**
     * This method gets called
     * whenever the weather measurements
     * have been updated
     *
     */
    void measurementsChanged(float newTemperature, float newHumidity, float newPressure);
}
