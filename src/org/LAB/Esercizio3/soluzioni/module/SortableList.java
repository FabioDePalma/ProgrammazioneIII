package org.LAB.Esercizio3.soluzioni.module;

/**
 *interfaccia che specifica i metodi che avrà la lista ordinabile
 *@param <T> tipo degli elementi della lista. T estende Comparable dato che la lista deve essere ordinata
 */

public interface SortableList<T extends Comparable> {
    public void add(T e);
    public void remove(T e);
    public void sort();
    public void print();
}