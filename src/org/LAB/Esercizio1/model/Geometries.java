package org.LAB.Esercizio1.model;

import java.util.ArrayList;

public class Geometries {
    ArrayList<Polygon> list;

    public Geometries() {
        this.list = new ArrayList<>();
    }

    public void insert(Polygon p){
        if(canInsert(p)){
            list.add(p);
        }else{
            System.err.println("Errore");
        }
    }

    public boolean canInsert(Polygon p){
        boolean flag= true;
        for(Polygon it: list){
            if(p != null){
                if(it.getClass() == p.getClass() && it.getBase() == p.getBase() && it.getHeight() == p.getHeight()){
                    flag = false;
                }
            }
        }
        return flag;
    }




    public void printObj(){
        for(Polygon it:list){
            //System.out.println(it.getClass().getName());
            it.print();
            System.out.println(" Base: "+ it.getBase() + " height: " + it.getHeight() +" Area: " +it.getArea());
            System.out.println();
        }
    }
}
