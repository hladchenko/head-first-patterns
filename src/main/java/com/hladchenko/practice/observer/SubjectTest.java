package com.hladchenko.practice.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectTest implements Subject{

    private final List<Observer> list;

    public SubjectTest() {
        this.list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        list.forEach(observer -> observer.update("Updated"));
    }
}
