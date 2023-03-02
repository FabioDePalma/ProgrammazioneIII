package org.LAB.Esercizio7ThreadPool.es1;

public class Matrix {
    int n;
    int m;
    int[][] matrix;
    public Matrix(int N, int M){
        n = N;
        m = M;

    }

    public void generate(){
        matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++ ){
                matrix[i][j] = (int) (Math.random() * 10000);
            }
        }
    }
    public int[] getRow(int index){
        return matrix[index];
    }
    public void print(){
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++ ){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    public int[][] getMatrix(){
        return matrix;
    }
}
