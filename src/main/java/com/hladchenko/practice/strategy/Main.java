package com.hladchenko.practice.strategy;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the strategy");

        Programmer ruslan = new Programmer(new SortAlgorithm());
        Programmer max = new Programmer(new RecursiveAlgorithm());

        ruslan.setBestAlgorithm(new RecursiveAlgorithm());
    }
}


class Programmer {

    private Algorithm bestAlgorithm;

    public Programmer(Algorithm algorithm) {
        this.bestAlgorithm = algorithm;
    }

    public Algorithm getBestAlgorithm() {
        return bestAlgorithm;
    }

    public void setBestAlgorithm(Algorithm bestAlgorithm) {
        this.bestAlgorithm = bestAlgorithm;
    }
}
