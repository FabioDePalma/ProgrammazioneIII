package org.LAB.Esercizio7ThreadPool.ServerSide;

public class ChopStick {
    //SERVER
    static int count = 0;
    int id;
    public ChopStick(){
        id = count++;
    }

    Filosofi owner;
    public synchronized void take(Filosofi filosofo) {
        while(owner != null){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        owner = filosofo;
        System.out.println("Sono "+ this +" e il filosofo che mi ha presa è: " + filosofo.getID());
    }

    public synchronized void release() {
        System.out.println("La "+ this +" di " + owner.getID() + " è stata rilasciata");
        owner = null;
        notify();
    }

    @Override
    public String toString() {
        return "Bacchetta{" + getID() + '}';
    }
    public int getID(){
        return id;
    }
}
