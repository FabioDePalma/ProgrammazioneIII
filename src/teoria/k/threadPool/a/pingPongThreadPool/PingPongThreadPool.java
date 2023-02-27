package teoria.k.threadPool.a.pingPongThreadPool;

import java.util.concurrent.*;
import java.util.*;

public class PingPongThreadPool {

    private static final int NUM_THREAD = 5;

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(NUM_THREAD);
        for (int i = 0; i < 10; i++) {
            Runnable task = new PingPong("PING" + i, 200);
            exec.execute(task);
        }
        exec.shutdown();
        try {
            exec.awaitTermination(5, TimeUnit.SECONDS);
                //Blocca finchè tutti i task
                // hanno completato l'esecuzione dopo la richiesta di shutdown
                // Oppure si verifica il timeout
                // o il thread corrente viene interrotto, a seconda di quale evento si verifichi per primo.
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}