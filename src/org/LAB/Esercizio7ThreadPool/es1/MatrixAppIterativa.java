package org.LAB.Esercizio7ThreadPool.es1;

public class MatrixAppIterativa {
    public static void main(String[] args) {
        int n = 10_000;
        int m = 10_000;
        Matrix matrix = new Matrix(n,m);
        matrix.generate();
        int[][] matrice = matrix.getMatrix();
        int max = 0;
        long startTime = System.nanoTime();
        for(int i = 0; i < matrice.length;i++){
            for(int j = 0; j < matrice[i].length;j++){
                if(max < matrice[i][j]){
                    max = matrice[i][j];
                }
            }
        }
        long endTime = System.nanoTime();
        long totalTime = endTime-startTime;
        double milliSeconds = totalTime/1_000_000;
        System.out.println("il massimo della matrice è:"+ max);
        System.out.println("durata: " + milliSeconds +" millise");
    }
}
