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

        Observer observer1 = new CurrentConditionsDisplay();
        Observer observer2 = new ForecastsDisplay();
        Observer observer3 = new StatisticsDisplay();

        WeatherData weatherData = new WeatherData();

        weatherData.registerObserver(observer1);
        weatherData.registerObserver(observer2);
        weatherData.registerObserver(observer3);

        weatherData.measurementsChanged(12f, 15f, 30f);
        System.out.println("--------------------------------");
        weatherData.measurementsChanged(0f, 25f, 300f);
    }
}
