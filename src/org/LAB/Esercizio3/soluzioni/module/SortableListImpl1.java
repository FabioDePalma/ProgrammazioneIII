package org.LAB.Esercizio3.soluzioni.module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
* Implementazione dell'interfaccia SortableList
*/

public class SortableListImpl1<T extends Comparable> implements SortableList<T> {
    private List<T> l;

    /**
     * Costruttore della classe.
     */
    public SortableListImpl1() {
        l = new ArrayList<T>();
    }

    /**
     * Aggiunge un elemento alla lista ordinabile.
     *
     * @param e elemento di tipo T da aggiungere alla lista ordinabile
     */
    public void add(T e) {
        l.add(e);
    }

    /**
     * Rimuove un elemento dalla lista ordinabile.
     *
     * @param e elemento di tipo T da rimuovere dalla lista ordinabile
     */
    public void remove(T e) {
        l.remove(e);
    }

    /**
     * Ordina gli elementi contenuti nella lista ordinabile
     */
    public void sort() {
        Collections.sort(l);

//        Possibile versione usando il metodo sort in List e le lambda expressions
//        this.l.sort((o1, o2) -> {
//            return o1.compareTo(o2);
//        });
    }

    /**
     * Visualizza a video gli elementi contenuti nella lista ordinabile
     */
    public void print() {
        for (T el : l) {
            System.out.println(el);
        }
    }
}
