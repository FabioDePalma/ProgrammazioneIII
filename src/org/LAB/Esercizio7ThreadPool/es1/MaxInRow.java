package org.LAB.Esercizio7ThreadPool.es1;

import java.util.concurrent.Callable;

public class MaxInRow implements Callable<Integer> {

    int[] row;
    public MaxInRow(int[] row){
        this.row = row;
    }
    @Override
    public Integer call() throws Exception {
        int max = 0;
        for (int i = 0; i < row.length; i++) {
            if(row[i] > max){
                max = row[i];
            }
        }
        return max;
    }
}
