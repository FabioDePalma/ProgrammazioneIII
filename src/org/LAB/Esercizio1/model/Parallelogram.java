package org.LAB.Esercizio1.model;

public class Parallelogram extends Polygon{


    public Parallelogram(int b, int h){
        super(4,b,h);
    }

    @Override
    public void print() {
        System.out.println("I'm a Parallelogram");
    }


    @Override
    public int getArea() {
        return this.getBase()*this.getHeight();
    }

    public int getPerimeter(){
        return (this.getBase()*this.getHeight())*2;
    }

    @Override
    public int compareTo(Object o) {
        if (o != null && o.getClass() == this.getClass()) {
            Parallelogram p = (Parallelogram) o;
            return this.getArea() - p.getArea();
        }else {
            return Integer.MIN_VALUE;
        }
    }

}
