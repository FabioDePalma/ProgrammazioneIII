package org.LAB.Esercizio4.es2.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Proverbi extends Observable {
    private List<String> proverbi;

    private String prossimoProverbio;

    public Proverbi(List<String> l){
        proverbi = l;
        createListProverbs();
    }

    private void createListProverbs(){
        File file = new File("src/org/LAB/Esercizio4/es2/ita_sentences.tsv");
        try {
            Scanner s1 = new Scanner(file);
            while(s1.hasNext()){
                String line = s1.nextLine();
                String[] values = line.split("\t");
                proverbi.add(values[2]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProssimoProverbio(){
        return prossimoProverbio;
    }


    public void clickButtonGetProverb(){
        Random r = new Random();
        int max = proverbi.size()-1;
        prossimoProverbio = proverbi.get(r.nextInt(max));

        //informo che è stato chiesto un nuovo proverbio
        setChanged();
        notifyObservers();
    }

}
