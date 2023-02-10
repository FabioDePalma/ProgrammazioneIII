package org.LAB.Esercizio3.module;

public interface SortableList <T extends Comparable<T>>{

    void add(T elem);
    void remove(T elem);
    void sort();
    void print();

}
