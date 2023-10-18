package com.hladchenko.patterns.strategy;

import com.hladchenko.patterns.strategy.fly.FlyRocketPowered;

/**
 * Патерн Стратегія визначає сімейство алгоритмів
 * інкапсулює кожен із них і забеспечує їхню взаємозамінність.
 * Він дозволяємодифікувати алгоритми незалежно від їхнього
 * викориснання з боку клієнта.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}