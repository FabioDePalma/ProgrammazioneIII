package org.LAB.Esercizio7ThreadPool.ServerSide;

public class Filosofi extends Thread{
    //client
    static int count = 0;
    int id;
    private ChopStick destra;
    private ChopStick sinistra;

    public Filosofi(ChopStick sx, ChopStick dx){
        destra = dx;
        sinistra = sx;
        id = count++;
        start();
    }

    public void thinking(){
        System.out.println(this + " penso");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void eating(){
        System.out.println("sono" + this +": prendo bacchetta sinistra:" + sinistra.getID());
        sinistra.take(this);
        System.out.println("sono" + this +": prendo bacchetta destra" + destra.getID());
        destra.take(this);

        try {
            System.out.println("sono "+ this + " e sto MANGIANDOOOOOOO");
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("sono" + this +": lascio la bacchetta destra" + destra.getID());
        destra.release();
        System.out.println("sono" + this +": lascio la bacchetta sinistra"+ sinistra.getID());
        sinistra.release();

    }
    public int getID(){
        return id;
    }

    @Override
    public String toString() {
        return "Filosofo{" + getID() + '}';
    }

    @Override
    public void run() {
        while(true){
            thinking();
            eating();
        }
    }

}
