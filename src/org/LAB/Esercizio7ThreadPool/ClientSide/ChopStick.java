package org.LAB.Esercizio7ThreadPool.ClientSide;

public class ChopStick {
    static int count = 0;
    int id;
    public ChopStick(){
        id = count++;
    }

    public int getID(){
        return id;
    }
}
