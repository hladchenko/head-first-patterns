package com.hladchenko.patterns.observer;

public class WeatherDataImpl implements WeatherData{
    @Override
    public int getTemperature() {
        return 0;
    }

    @Override
    public int getHumidity() {
        return 0;
    }

    @Override
    public int getPressure() {
        return 0;
    }

    @Override
    public void measurementsChanged() {


    }
}
