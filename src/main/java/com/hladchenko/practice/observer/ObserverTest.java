package com.hladchenko.practice.observer;

public class ObserverTest implements Observer{

    private final Subject subject;

    public ObserverTest(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(String s) {
        System.out.println("First: " + s);
    }
}
