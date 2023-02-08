package org.LAB.Esercizio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Queue<Integer> codaInt = new Queue<>(new ArrayList<>());
        codaInt.enqueue(3);
        codaInt.enqueue(5);
        codaInt.enqueue(7);
        codaInt.enqueue(2);
        codaInt.enqueue(1);
        codaInt.enqueue(6);
        codaInt.enqueue(38);
        codaInt.enqueue(350);
        codaInt.printQueue();

        codaInt.dequeue();
        codaInt.dequeue();
        codaInt.dequeue();
        codaInt.printQueue();

        Queue<Double> codaDo = new Queue<>(new LinkedList<>());
        //  codaDo.dequeue();
        codaDo.enqueue(3.5);
        codaDo.printQueue();
        codaDo.dequeue();
        codaDo.printQueue();


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        Calculator.print(list);
        System.out.println();
        System.out.println(Calculator.sum(list));


    }
}
