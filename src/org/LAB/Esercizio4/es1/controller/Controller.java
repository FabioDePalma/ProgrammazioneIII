package org.LAB.Esercizio4.es1.controller;

import org.LAB.Esercizio4.es1.model.Counter;
import org.LAB.Esercizio4.es1.model.Filter;
import org.LAB.Esercizio4.es1.view.Visualizer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {
    Visualizer v;
    Filter f;
    Counter c;

    public Controller(Counter c, Filter f, Visualizer v) {
        this.c = c;
        this.f = f;
        this.v = v;

        c.addObserver(this);
        f.addObserver(this);

    }

    public void run() {
        c.start();
    }


    @Override
    public void update(Observable o, Object arg) {
        /* Update Counter
        Update quando arriva la notify del counter parte il filtro e
        al filtro passiamo il counter per prenderci il valore da controllare
        */
        if (o instanceof Counter) {
            f.filter(c.getVal());
        }

         /* Update Filter
        Update quando arriva la notify del Filter parte il Visualizzatore e
        al Visualizzatore passiamo la lista da controllare
        */
        if(o instanceof Filter){
            v.visualize(f.getList());
        }
    }



}
