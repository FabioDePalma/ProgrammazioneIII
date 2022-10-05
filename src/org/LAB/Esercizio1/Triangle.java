package org.LAB.Esercizio1;

public class Triangle extends Polygon{

    public Triangle(int b, int h){
        super(3,b,h);
    }

    @Override
    public void print() {
        System.out.println("I'm a Triangle");
    }

    @Override
    public int getArea() {
        return (this.getBase()*this.getHeight())/2;
    }

    @Override
    public int compareTo(Object o) {
        if (o != null && o.getClass() == this.getClass()) {
            Triangle t = (Triangle) o;
            return this.getArea() - t.getArea();
        }else {
            return Integer.MIN_VALUE;
        }
    }
}
