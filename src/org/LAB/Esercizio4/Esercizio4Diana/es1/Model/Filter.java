package org.LAB.Esercizio4.Esercizio4Diana.es1.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Filter extends Observable {
    private List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public Filter() {
        list = new ArrayList<>();
    }

    public void filter(int c) {
        if (c % 5 == 0) {
            list.add(c);
            setChanged();
            notifyObservers();
        }
    }
}