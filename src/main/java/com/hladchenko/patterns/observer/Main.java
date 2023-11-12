package com.hladchenko.patterns.observer;

import com.hladchenko.patterns.observer.display.CurrentConditionsDisplay;
import com.hladchenko.patterns.observer.display.ForecastsDisplay;
import com.hladchenko.patterns.observer.display.StatisticsDisplay;

/**
 * Патерн Спостерігач визначає відношення
 * "один-до-дагатьох" між об'єктами таким чином,
 * що при зміні стану одного об'єкта відбувається
 * автоматичне сповіщення та оновлення всіх
 * залежних об'єктів.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Learning is in progress!");

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastsDisplay forecastsDisplay = new ForecastsDisplay(weatherData);

        weatherData.setMeasurements(5, 0, 2);
        weatherData.setMeasurements(11, 3, 12);
    }
}
