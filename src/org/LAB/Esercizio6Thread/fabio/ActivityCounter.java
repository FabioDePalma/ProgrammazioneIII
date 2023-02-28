package org.LAB.Esercizio6Thread.fabio;

public class ActivityCounter {
    private int counter;
    public ActivityCounter(){
        counter = 0;
    }
    public synchronized void setCounter(){
        counter++;
    }
    public synchronized int getCounter(){
        return counter;
    }

    @Override
    public String toString() {
        return "counter=" + counter;
    }
}
