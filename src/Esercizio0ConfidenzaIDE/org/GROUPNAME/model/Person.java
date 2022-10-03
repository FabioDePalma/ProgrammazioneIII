package Esercizio0ConfidenzaIDE.org.GROUPNAME.model;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Item> ownedItems;

    public Person(String name, int age, ArrayList<Item> ownedItems) {
        this.name = name;
        this.age = age;
        this.ownedItems = ownedItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Item> getOwnedItems() {
        return ownedItems;
    }

    public void addItem(Item item){
        this.ownedItems.add(item);
    }

    public void removeItem(Item item){
        if(ownedItems.contains(item)){
            ownedItems.remove(item);
        }else{
            System.out.println("item non esiste");
        }
    }
    public int totalValue(){
        int temp = 0;
        for (Item it: ownedItems) {
            temp = temp + it.getValue();
        }
        return temp;
    }


}
