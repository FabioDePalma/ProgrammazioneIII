package teoria.k.threadPool.c.scheduledExecutor;

import java.util.concurrent.Callable;

class Computazione1 implements Callable<Integer> {

    private int num;

    public Computazione1(int n) {
        num = n;
    }

    // call() deve restituire un Object
    public Integer call() {
        System.out.println("INIZIO computazione ");
        try {
            Thread.sleep((int) Math.round(Math.random() * 4000));
        } catch (InterruptedException e) {
            System.out.println("Interruzione thread");
        }
        System.out.println("FINE computazione");
        return 2 * num;
    }
}
