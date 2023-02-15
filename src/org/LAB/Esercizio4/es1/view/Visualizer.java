package org.LAB.Esercizio4.es1.view;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Visualizer {

    public void visualize(List<Integer> list) {
        boolean isPari = list.size() % 2 == 0;
        if(isPari){
            System.out.println("la lista è pari? "+ isPari +"\nlist size:" + list.size());
            list.forEach(elem -> System.out.print(elem + " "));
            System.out.println();
            System.out.println();
        }else{
            System.out.println("la lista è pari? "+ isPari);
        }


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}