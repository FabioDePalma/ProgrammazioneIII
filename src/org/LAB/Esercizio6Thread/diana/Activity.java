package org.LAB.Esercizio6Thread.diana;

public class Activity extends Thread {
    int id;
    int waitSec;

    ActivityCounter activityCounter;

    Lock lock = new ReentrantLock();
    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();

    public Activity(int id, int waitSec, ActivityCounter count){
        this.id = id;
        this.waitSec = waitSec;
        activityCounter = count;
    }

    public void run(){
        System.out.println("Activity " + id + " created now waiting...");

        while(){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lock();
        System.out.println("Activity " + id + " running, counter:" + activityCounter);
        try {
            sleep(waitSec * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        activityCounter.incrCounter();
        unLock();
        System.out.println("Activity " + id + " ended.");
        notifyAll();

    }

}
