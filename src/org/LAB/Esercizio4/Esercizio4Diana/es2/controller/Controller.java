package org.LAB.Esercizio4.Esercizio4Diana.es2.controller;

import org.LAB.Esercizio4.Esercizio4Diana.es2.model.Model;
import org.LAB.Esercizio4.Esercizio4Diana.es2.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Controller implements ActionListener, Observer {
    Model model;
    View view;

    public Controller(Model model, View view) {
        view.setListernButton(this);
        model.addObserver(this);
        this.model = model;
        this.view = view;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Model){
            //model.randomProverb();
            Model m = (Model) o;
            view.updateProverb(m.randomProverb());
            //TODO: da sistemapre, perchè questo aggiorna
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.randomNumber();
    }
    public void run(){
        model.randomProverb();
    }
}
