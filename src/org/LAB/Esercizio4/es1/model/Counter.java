package org.LAB.Esercizio4.es1.model;


import org.LAB.Esercizio4.es1.controller.Controller;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

public class Counter extends Observable {
    private int val;

    public Counter() {
        val = 0;
    }

    public void start() {
        for (int i = 0; i < 50; i++) {
            val++;
            System.out.println("è cambiato il valore del counter");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            setChanged();
            notifyObservers();


            /*
            if (val % 5 == 0) {//ogni volta che val è multiplo di 5 invoca il filtro
                //questo potrebbe essere spostato in Filter
                filter.filter(val);
            }
             */
        }
    }
    public int getVal(){
        return val;
    }

}