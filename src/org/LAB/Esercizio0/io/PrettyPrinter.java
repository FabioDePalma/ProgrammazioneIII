package org.LAB.Esercizio0.io;
import org.LAB.Esercizio0.model.Item;
import org.LAB.Esercizio0.model.Person;

import java.util.ArrayList;

public class PrettyPrinter {
    public void printPeople(ArrayList<Person> persone){
        System.out.println("-".repeat(80));
        for(Person it: persone){
            System.out.print("Name: " + it.getName() + " Age: " + it.getAge() + " Owned Value: " + it.totalValue()+"\n");
            printItem(it);
            System.out.println("-".repeat(80));
        }
    }
    public void printItem(Person it){
        for (Item i: it.getOwnedItems()){
            System.out.print(" " + i.getName()+ " " + i.getValue() + ", ");
        }
        System.out.println();
    }
}
