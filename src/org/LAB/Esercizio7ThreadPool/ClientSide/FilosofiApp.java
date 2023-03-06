package org.LAB.Esercizio7ThreadPool.ClientSide;


import java.util.ArrayList;

public class FilosofiApp {
    public static void main(String[] args) {
        int numeroFilosofi = 10;
        //ExecutorService exec = Executors.newFixedThreadPool(numeroFilosofi);


        ArrayList<Filosofi> f = new ArrayList<>();
        ArrayList<ChopStick> c = new ArrayList<>();
        for(int i = 0; i < numeroFilosofi; i++){
            c.add(new ChopStick());
        }
        for(int i = 0; i< numeroFilosofi-1; i++){
            f.add(new Filosofi(c.get(i), c.get(i+1)));
        }
        f.add(new Filosofi(c.get(0), c.get(c.size()-1)));
    }
}
