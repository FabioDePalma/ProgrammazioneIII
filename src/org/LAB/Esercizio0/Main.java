package org.LAB.Esercizio0;

import org.LAB.Esercizio0.io.PrettyPrinter;
import org.LAB.Esercizio0.model.Item;
import org.LAB.Esercizio0.model.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("cellulare", 20);
        Item i2 = new Item("pantaloni", 40);
        Item i3 = new Item("maglia", 40);
        Item i4 = new Item("reggiseno", 80);
        Item i5 = new Item("mutande", 100);
        Item i6 = new Item("sigaretta", 30);
        Item i7 = new Item("liquidi", 30);

        ArrayList<Item> listFabio = new ArrayList<>();
        Person fabio = new Person("Fabio", 26, listFabio);
        fabio.addItem(i1);
        fabio.addItem(i2);
        fabio.addItem(i3);
        fabio.addItem(i5);
        fabio.addItem(i6);
        fabio.addItem(i7);

        ArrayList<Item> listDiana = new ArrayList<>();
        Person diana = new Person("Diana", 26, listDiana);
        diana.addItem(i1);
        diana.addItem(i2);
        diana.addItem(i3);
        diana.addItem(i4);
        diana.addItem(i5);

        ArrayList<Person> persone = new ArrayList<>();
        persone.add(fabio);
        persone.add(diana);

        PrettyPrinter print = new PrettyPrinter();
        print.printPeople(persone);
    }
}
