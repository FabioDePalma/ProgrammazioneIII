package org.LAB.Esercizio7ThreadPool.soluzioni.es1;

import java.util.concurrent.Callable;

/**
 * Classe che rappresenta un task asincrono, che
 * produce un risultato di computazione di tipo int.
 */
class Maximum implements Callable<Long> {
    private long[] list;

    /**
     * Costruttore della classe.
     *
     * @param list   Riga di una matrice di cui trovare
     *               il massimo locale.
     */
    public Maximum(long[] list) {
        this.list = list;
    }

    /**
     * Esecuzione del task, che trova il massimo nella
     * riga di una matrice.
     *
     * @return   Il valore massimo della riga esaminata.
     */
    public Long call() {
        long max = list[0];
        for (long j : list)
            if (j > max)
                max = j;
        return max;
    }
}
