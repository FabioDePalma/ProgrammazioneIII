package org.LAB.Esercizio6Thread.diana;

public class ActivityTest {
    public static void main(String[] args) {
        ActivityCounter counter = new ActivityCounter();
        Activity a0 = new Activity(0,3, counter);
        Activity a1 = new Activity(1,1, counter);
        Activity a2 = new Activity(2,5, counter);
        Activity a3 = new Activity(3,10, counter);
        Activity a4 = new Activity(4,4, counter);
        Activity a5 = new Activity(5,3, counter);
        a0.start();
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();

    }
}
