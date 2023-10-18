package com.hladchenko.patterns.duck;

import com.hladchenko.patterns.duck.fly.FlyWithWings;
import com.hladchenko.patterns.duck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
