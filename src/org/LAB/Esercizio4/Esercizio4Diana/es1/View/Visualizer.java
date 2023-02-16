package org.LAB.Esercizio4.Esercizio4Diana.es1.View;

import java.util.List;

public class Visualizer {

    public void visualize(List<Integer> list) {
        int size = list.size();
        if(size % 2 == 0){
            System.out.println("list size: " + size);
            for (Integer i : list) {
                System.out.println(i.intValue());
            }
            System.out.println();
        }
    }
}