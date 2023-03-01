package org.LAB.Esercizio6Thread.esercizio;

import java.util.ArrayList;

public class ActivityTest {
    public static void main(String[] args) {
        ActivityCounter counter = new ActivityCounter();
        ArrayList<Activity> listThreads = new ArrayList<>();
        Activity a0 = new Activity(0,3, counter);
        Activity a1 = new Activity(1,1, a0, counter);
        Activity a2 = new Activity(2,5, a0, counter);
        Activity a3 = new Activity(3,10, a0, counter);
        ArrayList<Thread> l = new ArrayList<>();
        l.add(a1);
        l.add(a2);
        l.add(a3);
        Activity a4 = new Activity(4,4, l, counter);
        listThreads.add(a0);
        listThreads.add(a1);
        listThreads.add(a2);
        listThreads.add(a3);
        listThreads.add(a4);


        Activity wait5 = a4;
        for (int i = 0; i < 5; i++) {
            Activity a5 = new Activity(5,3, wait5, counter);
            listThreads.add(a5);
            wait5 = a5;
        }


        for (Activity a: listThreads){
            a.start();
        }

    }
}
