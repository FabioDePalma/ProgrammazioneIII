package teoria.k.threadPool.b.futureCallable;

import java.util.concurrent.Callable;

class Computazione implements Callable<Integer> {

    private int num;

    public Computazione(int n) {
        num = n;
    }

    // call() deve restituire un Object
    public Integer call() {
        System.out.println("INIZIO computazione " + num);
        try {
            Thread.sleep((int) Math.round(Math.random() * 10000));
        } catch (InterruptedException e) {
            System.out.println("Interruzione thread");
        }
        System.out.println("FINE computazione " + num + ": risultato = " + 2 * num);
        return 2*num; //return new Integer(2*num)
    }
}
