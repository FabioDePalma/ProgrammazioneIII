package org.LAB.Esercizio7ThreadPool.soluzioni.es1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Compute few simple stats about values contained in an `ArrayList<Double>`.
 */
public class Stats {
    private double mean;
    private double std;

    private double min;
    private double max;

    public Stats(ArrayList<Double> array) {
        computeMean(array);
        computeStd(array);
        computeMinMax(array);
    }

    private void computeMean(ArrayList<Double> array) {
        double sum = 0.0;
        for(Double val: array) {
            sum += val;
        }

        mean = sum / array.size();
    }

    private void computeStd(ArrayList<Double> array) {
        double resSum = 0.0;

        for(Double val: array) {
            resSum += Math.pow(val - mean, 2);
        }

        std = Math.sqrt(resSum / (array.size() - 1));
    }

    private void computeMinMax(ArrayList<Double> array) {
        min = max = array.get(0);

        for(Double val: array) {
            if(val < min) {
                min = val;
            }

            if(val > max) {
                max = val;
            }
        }
    }

    /**
     * @return la media dei valori nell'arraylist
     */
    public double getMean() {
        return mean;
    }

    /**
     *
     * @return la deviazione standard *campionaria* dei valori nell'arraylist
     */
    public double getStd() {
        return std;
    }


    /**
     * @return il minimimo dei valori nell'arraylist
     */
    public double getMin() {
        return min;
    }

    /**
     * @return il massimo dei valori nell'arraylist
     */
    public double getMax() {
        return max;
    }

}
