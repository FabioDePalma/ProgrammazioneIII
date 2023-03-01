package org.LAB.Esercizio6Thread.esercizio;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Activity extends Thread {
    int id;
    int waitSec;

    Lock lock = new ReentrantLock();
    ActivityCounter activityCounter;

    ArrayList<Thread> waitingThreads;
    int loop;





    public Activity(int id, int waitSec, ArrayList<Thread> waitingThreads, ActivityCounter count){
        this(id,waitSec,count);
        this.waitingThreads = waitingThreads;
    }
    public Activity(int id, int waitSec, Activity waitingThread, ActivityCounter count){
        this(id,waitSec,count);
        waitingThreads.add(waitingThread);
    }
    /*
    first thread
     */
    public Activity(int id, int waitSec, ActivityCounter count){
        this.id = id;
        this.waitSec = waitSec;
        activityCounter = count;
        this.waitingThreads = new ArrayList<>();
    }


    public void run(){
        System.out.println("Activity " + id + " created now waiting...");

        if(waitingThreads.size() != 0){
            for(Thread t: waitingThreads){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        System.out.println("Activity " + id + " running, counter:" + activityCounter);

        try {
            sleep(waitSec * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        activityCounter.incrCounter();
        System.out.println("Activity " + id + " ended.");







    }

}
