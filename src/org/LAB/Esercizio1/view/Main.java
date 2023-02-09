package org.LAB.Esercizio1.view;

import org.LAB.Esercizio1.model.Geometries;
import org.LAB.Esercizio1.model.Parallelogram;
import org.LAB.Esercizio1.model.Rectangle;
import org.LAB.Esercizio1.model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Geometries g = new Geometries();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Quanti poligoni vuoi inserire?");
        int nrPoly = myObj.nextInt();  // Read user input
        System.out.println("Hai scelto di inserire" + nrPoly + "poligoni");
        for (int i = 0; i < nrPoly; i++){
            System.out.println("Inserisci il tipo di poligono scegliengo tra:");
            System.out.println("1. Rettangolo");
            System.out.println("2. Parallelogramma");
            System.out.println("3. Triangolo");
            int tipoPoly = myObj.nextInt();  // Read user input
            System.out.println("Inserisci base:");
            int base = myObj.nextInt();
            System.out.println("Inserisci altezza:");
            int altezza = myObj.nextInt();

            switch (tipoPoly) {
                case 1:
                    Rectangle rettangolo = new Rectangle(altezza, base);
                    g.insert(rettangolo);
                    break;
                case 2:
                    Parallelogram parall = new Parallelogram(altezza, base);
                    g.insert(parall);
                    break;
                case 3:
                    Triangle triangolo = new Triangle(altezza, base);
                    g.insert(triangolo);
                    break;
                default:
                    System.out.println("Il valore inserito non è corretto, inserisci un valore corretto!");
                    i--;
                    break;
            }
        }
        System.out.println("Hai inserito:");
        g.printObj();
        System.out.println("Fineeeeee");
    }
}
