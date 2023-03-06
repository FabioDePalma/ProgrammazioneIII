package org.LAB.Esercizio7ThreadPool.ClientSide;


public class Filosofi extends Thread {
    ChopStick destra;
    ChopStick sinistra;

    static int count = 0;
    int id;



    public Filosofi(ChopStick sx, ChopStick dx){
        sinistra = sx;
        destra = dx;
        id = count++;
        start();
    }
    public void eating(){
        synchronized (sinistra){
            System.out.println("sono: "+ id +" prendo bacchetta sinistra" + sinistra.getID());
            // lock sulla bacchetta sinistra
            synchronized (destra){
                System.out.println("sono"+ id +" prendo bacchetta destra" + destra.getID());
                //lock sulla backetta destra
                try {
                    System.out.println(id + " Mangio");
                    sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public synchronized void thinking(){
        System.out.println(id + " penso");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while(true){
            thinking();
            eating();
        }
    }
}
