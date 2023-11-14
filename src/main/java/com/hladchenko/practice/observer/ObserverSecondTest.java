package com.hladchenko.practice.observer;

public class ObserverSecondTest implements Observer{

    private final Subject subject;

    public ObserverSecondTest(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(String s) {
        System.out.println("Second: " + s);
    }
}
