package org.LAB.Esercizio1.model;

public class Rectangle extends Polygon {

    public Rectangle(int b, int h){
        super(4,b,h);
    }

    @Override
    public void print() {
        System.out.println("I'm a Rectangle");
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
            Rectangle r = (Rectangle) o;
            return this.getArea() - r.getArea();
        }else {
            return Integer.MIN_VALUE;
        }
    }




}
