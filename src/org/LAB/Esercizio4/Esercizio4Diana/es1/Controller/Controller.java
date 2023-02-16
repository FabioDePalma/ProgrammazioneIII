package org.LAB.Esercizio4.Esercizio4Diana.es1.Controller;

import org.LAB.Esercizio4.Esercizio4Diana.es1.Model.Counter;
import org.LAB.Esercizio4.Esercizio4Diana.es1.Model.Filter;
import org.LAB.Esercizio4.Esercizio4Diana.es1.View.Visualizer;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {
    Counter counter;
    Filter filter;
    Visualizer visualizer;

    public Controller(Counter counter, Filter filter, Visualizer visualizer) {
        this.counter = counter;
        this.filter = filter;
        this.visualizer = visualizer;
        counter.addObserver(this);
        filter.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        //notify di Counter
        if(o instanceof Counter){
            filter.filter(counter.getVal());
        }
        //notify di Filter
        if (o instanceof Filter){
            visualizer.visualize(filter.getList());
        }
    }
    public void run(){
        counter.start();
    }
}
