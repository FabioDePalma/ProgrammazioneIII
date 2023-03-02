package org.LAB.Esercizio7ThreadPool.soluzioni.es1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Executors;
import java.util.*;

/**
 * Classe che contiene il main. Crea dei tasks asicroni che lavorano sulla
 * stessa matrice, e che sono eseguiti da un ThreadPool.
 */
public class CallableTest {
	private static int N = 100;
	private static int NUM_THREADS = 10;

    public static void main (String[] args) {
		long[][] matr = new long[N][N];
		initialize(matr);
		print(matr);

		long maximum = matr[0][0];

		ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
		Vector<FutureTask<Long>> tasks = new Vector<>();
		for (int i=0; i<N; i++) {
			FutureTask<Long> ft = new FutureTask<>(new Maximum(matr[i]));
			tasks.add(ft);
			executor.execute(ft);
		}
		try {
			for (int i=0; i<matr.length; i++) {
				FutureTask<Long> f = tasks.get(i);
				long localMax = f.get();
				if (localMax > maximum)
					maximum = localMax;
			}
		} catch (Exception e) {System.out.println(e.getMessage());}
		System.out.println("Il massimo è: " + maximum);

		executor.shutdown();
    }

    /**
	 * Inizializza una matrice di interi con numeri casuali.
	 *
	 * @param matr   La matrice da inizializzare
	 */
  	private static void initialize(long[][] matr) {
		Random r = new Random();
		for (int i=0; i<matr.length; i++) {
			for (int j=0; j<matr[i].length; j++) {
				matr[i][j] = r.nextLong(matr.length * matr.length * 100000);
			}
		}
  	}

  	/**
	 * Stampa le informazioni relative a una matrice.
	 *
	 * @param matr   La matrice di cui stampare le informazioni
	 */
  	private static void print(long[][] matr) {
		System.out.println("Matrix size [" + matr.length + "," + matr[0].length + "]" );
  	}
}