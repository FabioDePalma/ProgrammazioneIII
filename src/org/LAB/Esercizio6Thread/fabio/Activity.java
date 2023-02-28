package org.LAB.Esercizio6Thread.fabio;

import java.util.concurrent.Semaphore;

public class Activity extends Thread {
    int id;
    int waitSec;

    ActivityCounter activityCounter;





    public Activity(int id, int waitSec, ActivityCounter count){
        this.id = id;
        this.waitSec = waitSec;
        activityCounter = count;
    }

    public void run(){
        System.out.println("Activity " + id + " created now waiting...");

        while(true){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Activity " + id + " running, counter:" + activityCounter.getCounter());
        try {
            sleep(waitSec * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        activityCounter.setCounter();

        System.out.println("Activity " + id + " ended.");
        notifyAll();

    }

}
