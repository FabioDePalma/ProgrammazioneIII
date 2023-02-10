package org.LAB.Esercizio3.module;

import java.util.ArrayList;
import java.util.Objects;

public class SortableListImpl<T extends Comparable<T>> implements SortableList<T> {
    private ArrayList<T> list;

    public SortableListImpl() {
        list = new ArrayList<>();
    }

    public void add(T elem){
        list.add(elem);
    }
    public void remove(T elem){
        list.remove(elem);
    }
    public void sort(){
        list.sort((a,b)->a.compareTo(b));
    }
    public void print(){
        System.out.print("[");
        list.forEach(elem -> { System.out.print(" " + elem + " "); } );
        System.out.print("]\n");
    }




}
