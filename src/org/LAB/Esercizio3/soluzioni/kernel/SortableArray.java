package org.LAB.Esercizio3.soluzioni.kernel;


import org.LAB.Esercizio3.soluzioni.module.SortableList;

/**
*Kernel
*@param <T> tipo degli elementi della lista. T estende Comparable dato che la lista deve essere ordinata
*/

public class SortableArray<T extends Comparable> { 
    //modulo viene specificato dalla interface
    private SortableList<T> obj;

    /**
     * Aggiunge un modulo al Kernel
     */
    public void addModule(SortableList<T> m) {
        this.obj = m;
    }

    /**
     * Aggiunge un elemento al modulo
     */
    public void add(T e) {
        this.obj.add(e);
    }

    /**
     * Elimina un elemento dal modulo
     */
    public void remove(T e) {
        this.obj.remove(e);
    }

    /**
     * Ordina gli elementi del modulo
     */
    public void sort() {
        this.obj.sort();
    }

    /**
     * Visualizza a video gli elementi contenuti dal modulo
     */
    public void print() {
        this.obj.print();
    }
}
