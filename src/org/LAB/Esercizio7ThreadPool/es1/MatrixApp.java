package org.LAB.Esercizio7ThreadPool.es1;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class MatrixApp {
    public static void main(String[] args) {
        int n = 10_000;
        int m = 10_000;
        Matrix matrix = new Matrix(n,m);
        matrix.generate();
        //matrix.print();

        ExecutorService exec = Executors.newFixedThreadPool(2);
        Vector<FutureTask<Integer>> tasks = new Vector<>();
        long startTime = System.nanoTime();
        //per ogni riga creo il task per trovare il massimo e
        //i task che trovano il massimo li salvo in un vettore
        for(int i = 0; i < n; i++){
            FutureTask<Integer> ft = new FutureTask<>( new MaxInRow(matrix.getRow(i)) );
            tasks.add(ft);
            exec.execute(ft);
        }

        //itero sul vettore di task e prendo il risultato per ogni riga
        ArrayList<Integer> maxRow = new ArrayList<>();
        int max=0;
        int temp;
        for(FutureTask<Integer> task: tasks){
            try {
                temp = task.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
            if(temp>max){
                max = temp;
            }
        }

        long endTime = System.nanoTime();
        long totalTime = endTime-startTime;
        double milliSeconds = totalTime/1_000_000;
        System.out.println("il massimo della matrice è:"+ max);
        System.out.println("durata: " + milliSeconds + "millise");
        exec.shutdown();
    }
}
