package org.LAB.Esercizio4.Esercizio4Diana.es1.Model;

import java.util.Observable;


public class Counter extends Observable {
    private int val;

    public int getVal() {
        return val;
    }

    public Counter() {
        val = 0;
    }

    public void start() {
        for (int i = 0; i < 50; i++) {
            val++;
            setChanged();
            notifyObservers();

        }
    }
}