package com.hladchenko.practice.observer;

public class Main {

    public static void main(String[] args) {
        Subject subject = new SubjectTest();

        Observer ob1 = new ObserverTest(subject);
        Observer ob2 = new ObserverSecondTest(subject);

        subject.notifyObservers();
    }
}
