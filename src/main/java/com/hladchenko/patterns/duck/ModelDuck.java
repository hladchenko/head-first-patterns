package com.hladchenko.patterns.duck;

import com.hladchenko.patterns.duck.fly.FlyNoWay;
import com.hladchenko.patterns.duck.quack.Quack;

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
