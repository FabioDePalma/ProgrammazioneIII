package org.LAB.Esercizio4.es1;

import java.util.List;

class Visualizer {

    public void visualize(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i.intValue());
        }
        System.out.println();
    }
}