package org.LAB.Esercizio1.model;

public abstract class  Polygon implements Comparable{

    public abstract void print();
    public abstract int getArea();



    private int numVertices;
    private int base;
    private int height;

    public Polygon(int numVertices, int base, int height) {
        this.numVertices = numVertices;
        this.base = base;
        this.height = height;
    }
    public int getNumVertices() {
        return numVertices;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }




}
