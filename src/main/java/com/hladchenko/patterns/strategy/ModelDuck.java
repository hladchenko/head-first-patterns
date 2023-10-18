package com.hladchenko.patterns.strategy;

import com.hladchenko.patterns.strategy.fly.FlyNoWay;
import com.hladchenko.patterns.strategy.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
