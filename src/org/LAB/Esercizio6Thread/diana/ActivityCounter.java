package org.LAB.Esercizio6Thread.diana;

public class ActivityCounter {
    int counter;
    public ActivityCounter(){
        counter = 0;
    }
    public void incrCounter(){
        counter++;
    }

    @Override
    public String toString() {
        return "counter=" + counter;
    }
}
