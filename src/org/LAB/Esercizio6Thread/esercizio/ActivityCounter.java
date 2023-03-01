package org.LAB.Esercizio6Thread.esercizio;

public class ActivityCounter {
    private int counter;
    public ActivityCounter(){
        counter = 0;
    }
    public synchronized void incrCounter(){
        counter++;
    }

    @Override
    public String toString() {
        return "counter=" + counter;
    }
}
