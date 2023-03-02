package teoria.k.threadPool.c.scheduledExecutor;

import java.util.concurrent.*;
import java.util.*;

// schedule (Runnable task, long delay, TimeUnit timeunit)
public class ScheduledExecutorTest {

    public static void main(String[] args) {
        // esempio di scheduling di task con ritardo
        System.out.println("Lancio un task con ritardo");
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        ScheduledFuture<Integer> task = exec.schedule(new Computazione1(2), 4, TimeUnit.SECONDS);
        try {
            System.out.println("Risultato = " + task.get());
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // esempio di scheduling di task ciclico con ritardo iniziale
        // scheduleAtFixedRate (Runnable, long initialDelay, long period, TimeUnit timeunit)
        System.out.println("Ora lancio un task ciclico ma lo lascio andare avanti solo per pochi secondi");
        exec.scheduleAtFixedRate(new MyTask("TASK"), 2, 3, TimeUnit.SECONDS);
        try {
            System.out.println("dormo per 20 secondi");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        exec.shutdown();
    }
}
