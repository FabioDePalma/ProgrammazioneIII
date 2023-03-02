package teoria.k.threadPool.b.futureCallable;

import java.util.concurrent.*;
import java.util.*;

public class CallableTest {

    private static int N = 10;
    private static int NUM_THREADS = 2;

    public static void main(String[] args) {

        System.out.println("inizio il main");
        int total = 2;
        ExecutorService exec = Executors.newFixedThreadPool(NUM_THREADS);
        //ExecutorService exec = Executors.newSingleThreadExecutor();
        // creo i task callable
        Vector<FutureTask<Integer>> tasks = new Vector<>();

        for (int i = 0; i < N; i++) {
            FutureTask<Integer> ft = new FutureTask<>(new Computazione(i));
            tasks.add(ft);
            exec.execute(ft);
        }
        try {
            for (FutureTask<Integer> task : tasks) {
                total = total + task.get();
                //System.out.println("total + numTask: "+total);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nIl totale è: " + total);
        exec.shutdown();
    }
}