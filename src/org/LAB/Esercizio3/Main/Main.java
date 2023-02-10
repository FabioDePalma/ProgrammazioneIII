package org.LAB.Esercizio3.Main;

import org.LAB.Esercizio3.kernel.SortableArray;
import org.LAB.Esercizio3.module.SortableList;
import org.LAB.Esercizio3.module.SortableListImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SortableArray<String> kernel = new SortableArray<>();
        kernel.addModulo(new SortableListImpl<>());

        kernel.add("irsho");
        kernel.add("febbre");
        kernel.add("marce");
        kernel.add("cagarella");
        kernel.add("mirko");
        kernel.add("covid");
        kernel.add("torna");
        kernel.add("in uni");

        kernel.print();
        System.out.println("ordino");
        kernel.sort();
        kernel.print();

        SortableArray<Integer> arr = new SortableArray<>();
        arr.addModulo(new SortableListImpl<>());
        arr.add(5);
        arr.add(3);
        arr.add(4);
        arr.add(52);
        arr.add(7);
        arr.add(8);
        arr.add(5);
        arr.add(2);
        arr.add(20);

        arr.print();
        System.out.println("ordino");
        arr.sort();
    }
}
