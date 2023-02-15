package org.LAB.Esercizio4.es2.controller;

import org.LAB.Esercizio4.es2.model.Proverbi;
import org.LAB.Esercizio4.es2.view.FinestraProverbi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Controller implements ActionListener, Observer {
    Proverbi model;
    FinestraProverbi view;

    public Controller(FinestraProverbi v, Proverbi m){
        this.view = v;
        this.model = m;
        v.setListener(this);
        m.addObserver(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.clickButtonGetProverb();
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Proverbi){
            view.updateString(model.getProssimoProverbio());
        }
    }
}
