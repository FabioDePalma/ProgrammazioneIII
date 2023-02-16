package org.LAB.Esercizio4.Esercizio4Diana.es2.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JButton button;
    private JPanel panel;
    private JLabel display;
    private JLabel proverb;

    public View(){
        super("Proverbi:");
        panel = new JPanel();
        add(panel);
        button = new JButton("Chiedi proverbio");
        panel.add(button);
        display = new JLabel();
        display.setText("Proverbio: ");//sbagliato, lo deve prendere dal set
        panel.add(display);
        proverb = new JLabel("Visualizzi il proverbio qui");
        panel.add(proverb);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);

    }

    public void setListernButton(ActionListener b){
        button.addActionListener(b);
    }
    public void updateProverb(String newProverb) {
        proverb.setText(newProverb);
    }

}
