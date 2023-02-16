package org.LAB.Esercizio4.Esercizio4Diana.es2.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.List;
import java.util.Random;

public class Model extends Observable {

    private List<String> list;
    private int index;
    //TODO: importare una lista di proverbi
    public Model() {
        list = new ArrayList<>();
        list.add("A brigante brigante e mezzo.");
        list.add("A buon cavalier non manca lancia.");
        list.add("A buon cavallo non manca sella.");
        list.add("All'eco spetta l'ultima parola.");
        list.add("Beato chi va per la via di mezzo.");
        list.add("Cavallo da vettura, poco costa e poco dura.");
        list.add("Chi mal semina mal raccoglie.");
        list.add("Chi vuol pane, meni letame.");
    }
    public List<String> getList() {
        return list;
    }

    public String randomProverb(){
        //return list.get(n);
        //randomNumber();
        String proverbio = list.get(index);
        System.out.println(proverbio);
        return proverbio;
    }

    public void randomNumber(){
        Random rand = new Random();
        index = rand.nextInt(0, list.size()-1);

        setChanged();
        notifyObservers();
    }

}
