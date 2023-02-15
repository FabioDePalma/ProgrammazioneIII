package org.LAB.Esercizio4.es1.model;

import org.LAB.Esercizio4.es1.view.Visualizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.TimeUnit;

public class Filter extends Observable {
    private List<Integer> list;

    public Filter() {
        list = new ArrayList<>();
    }

    public void filter(int c) {
        /*
        Se il val è multiplo di 5 lo aggiungo alla lista e notifico che ho aggiunto
        cosi che poi posso controllare se la lunghezza è pari
         */
        if(c % 5 == 0){
            list.add(c);
            System.out.println("il valore è multiplo di 5 aggiungo alla lista");
            setChanged();
            notifyObservers();
        }else{
            System.out.println("il valore NON è multiplo di 5");

        }


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /*
        Questo possiamo spostarlo nella classe visualizer dato che sarà sua responsabilità
        verificare se la lista è pari e poterla visualizzare

        if (list.size()%2==0) {
            System.out.println("list size: " + list.size());
            visualizer.visualize(list);
        }

         */
    }
    public List<Integer> getList(){
        return list;
    }
}