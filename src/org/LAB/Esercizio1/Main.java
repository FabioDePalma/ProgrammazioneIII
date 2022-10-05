package org.LAB.Esercizio1;

public class Main {
    public static void main(String[] args) {
        Geometries g = new Geometries();

        Rectangle r1 = new Rectangle(2,4);
        Rectangle r2 = new Rectangle(6,7);
        Triangle t1 = new Triangle(6,8);
        Triangle t2 = new Triangle(8,10);
        Parallelogram p1 = new Parallelogram(2,4);
        Parallelogram p2 = new Parallelogram(6,3);
        Parallelogram p3 = new Parallelogram(2,4);

        g.insert(r1);
        g.insert(r2);
        g.insert(t1);
        g.insert(t2);
        g.insert(p1);
        g.insert(p2);
        g.insert(p3);//questo dovrebbe dare errore!

        g.printObj();
    }
}
