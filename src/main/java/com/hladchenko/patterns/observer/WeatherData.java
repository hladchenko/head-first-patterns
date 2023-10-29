package com.hladchenko.patterns.observer;

import com.hladchenko.patterns.observer.display.CurrentConditionsDisplay;
import com.hladchenko.patterns.observer.display.Display;
import com.hladchenko.patterns.observer.display.ForecastsDisplay;
import com.hladchenko.patterns.observer.display.StatisticsDisplay;

public class WeatherData implements WeatherDataInterface {

    Display currentConditionsDisplay = new CurrentConditionsDisplay();
    Display forecastsDisplay = new ForecastsDisplay();
    Display statisticsDisplay = new StatisticsDisplay();


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

        float temp = getTemperature();
        float pressure = getPressure();
        float humidity = getHumidity();

        currentConditionsDisplay.update(temp, pressure, humidity);
        statisticsDisplay.update(temp, pressure, humidity);
        forecastsDisplay.update(temp, pressure, humidity);

    }
}
