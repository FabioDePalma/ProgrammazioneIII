package org.LAB.Esercizio3.kernel;

import org.LAB.Esercizio3.module.SortableList;

public class SortableArray<T extends Comparable<T>> {
    private SortableList<T> obj;

    public void addModulo(SortableList<T> list){
        obj=list;
    }
    public void add(T elem){
        obj.add(elem);
    }
    public void remove(T elem) {
        obj.remove(elem);
    }
    public void sort(){
        obj.sort();
    }
    public void print(){
        obj.print();
    }

}
