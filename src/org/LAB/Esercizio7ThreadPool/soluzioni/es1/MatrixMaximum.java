package org.LAB.Esercizio7ThreadPool.soluzioni.es1;



import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.text.SimpleDateFormat;

/**
 * Lancia esperimenti legati all'uso dei ThreadPools.
 */
public class MatrixMaximum {
    final static int NROWS = 10000;
    final static int NCOLS = 10000;
    final static int NUM_THREADS = 3;

    final static int NUM_REPETITIONS = 20;

    /**
     * Crea una matrice contenente valori casuali e ne trova il massimo valore in due modi distinti:
     * - sequenzialmente
     * - utilizzando un ThreadPool con NUM_THREADS threads che trovano il massimo tra le righe della matrice
     *               per poi restituire il massimo tra i massimi trovati.
     * @param args non usato
     */
    public static void main(String[] args) {
        System.out.println("Initializing a random matrix with: " + NROWS * NCOLS + " random elements");
        long[][] array = randomArray();

        System.out.println("Starting experiments");

        Stats elapsed = measureExecutionTime(NUM_REPETITIONS, () -> {
            computeMax(array);
        });
        System.out.println("Avg time to find max (sequential): " + elapsed.getMean() + "s, " +
                            "standard deviation: " + elapsed.getStd() + "s, " +
                            "min: " + elapsed.getMin() + "s, " +
                            "max: " + elapsed.getMax() + "s");

        elapsed = measureExecutionTime(NUM_REPETITIONS, () -> {
            multithreadedMax(array);
        });
        System.out.println("Avg time to find max (multithread): " + elapsed.getMean() + "s, " +
                "standard deviation: " + elapsed.getStd() + "s, " +
                "min: " + elapsed.getMin() + "s, " +
                "max: " + elapsed.getMax() + "s");
    }

    /**
     * Metodo di supporto per calcolare il tempo impiegato da un certo numero di ripetizioni di un dato algoritmo
     * @param numRepetitions numero di volte che l'algoritmo deve essere eseguito
     * @param fun un Runnable che lancia l'algoritmo il cui tempo deve essere misurato
     * @return
     */
    private static Stats measureExecutionTime(int numRepetitions, Runnable fun) {
        ArrayList<Double> timings = new ArrayList<>();
        for(int i=0; i<numRepetitions; ++i) {
            long start = System.nanoTime();
            fun.run();
            long end = System.nanoTime();
            timings.add((end - start) / 1E9);
        }

        return new Stats(timings);
    }

    /**
     * Ricerca del massimo, versione multi-thread
     * @param array matrice bidimensionale il cui massimo va trovato
     * @return il massimo valore presente nella matrice
     */
    private static long multithreadedMax(long[][] array) {
        long maximum = array[0][0];

        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        ArrayList<FutureTask<Long>> tasks = new ArrayList<>();
        initializeTasks(array, executor, tasks);

        try {
            for(FutureTask<Long> f: tasks) {
                long rowMax = f.get();
                if (rowMax > maximum)
                    maximum = rowMax;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        executor.shutdown();
        return maximum;
    }

    /**
     * Crea un task `Maximum` per ogni riga della matrice in input, li aggiunge alla lista dei task `tasks`,
     *      e ne invoca l'esecuzione sul dato `executor`.
     *
     * @param array
     * @param executor
     * @param tasks
     */
    private static void initializeTasks(long[][] array, ExecutorService executor, ArrayList<FutureTask<Long>> tasks) {
        for (int i=0; i<NROWS; i++) {
            FutureTask<Long> ft = new FutureTask<>(new Maximum(array[i]));
            tasks.add(ft);
            executor.execute(ft);
        }
    }

    /**
     * Trova il massimo nel dato `array`, versione sequenziale.
     * @param array
     * @return
     */
    private static long computeMax(long[][] array) {
        long curMax = array[0][0];
        for(int i=0; i<NROWS; i++) {
            for(int j=0; j<NCOLS; j++) {
                if(array[i][j] > curMax) {
                    curMax = array[i][j];
                }
            }
        }

        return curMax;
    }

    /**
     * Crea una matrice di
     * @return
     */
    private static long[][] randomArray() {
        long[][] array = new long[NROWS][NCOLS];

        for(int i=0; i<NROWS; ++i) {
            for(int j=0; j<NCOLS; ++j) {
                array[i][j] = (long) (Math.random() * 1E16);
            }
        }

        return array;
    }
}
