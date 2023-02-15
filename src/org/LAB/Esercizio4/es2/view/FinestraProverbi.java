package org.LAB.Esercizio4.es2.view;

import org.LAB.Esercizio4.es2.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FinestraProverbi extends JFrame  {
    private JPanel panel;

    private JButton button;

    private JLabel label;

    public FinestraProverbi(){
        super("Proverbi:");
        //panel = new JPanel();
        button = new JButton("Genera Proverbio");
        label = new JLabel("prova");
        //button.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40));questo non va bene perchè imposta il layout
        //solo per il bottone ma noi vogliamo su tutta la finestra:
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40));
        add(button);
        add(label);
        //add(panel);
        //button.addActionListener(e -> System.out.println("ciao"));

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void setListener(ActionListener c){
        button.addActionListener(c); // aggancia il listener del controller al bottone
    }
    public void updateString(String newprov){
        label.setText(newprov);
    }

}
