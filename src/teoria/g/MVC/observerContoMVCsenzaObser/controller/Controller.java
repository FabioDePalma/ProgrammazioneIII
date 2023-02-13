package teoria.g.MVC.observerContoMVCsenzaObser.controller;

import teoria.g.MVC.observerContoMVCsenzaObser.model.ContoBancario;
import teoria.g.MVC.observerContoMVCsenzaObser.view.FinestraConto;
import teoria.g.MVC.observerContoMVCsenzaObser.view.GestisciOperazioni;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private ContoBancario cb;
    private GestisciOperazioni go;
    private FinestraConto fc;
    private JTextField inputVal;

    public Controller(ContoBancario conto, GestisciOperazioni view, FinestraConto f) {
        cb = conto;
        go = view;
        fc = f;
        inputVal = view.getInputVal();
    }

    public void actionPerformed(ActionEvent e) {
        int val = 0;
        try {
            val = Integer.parseInt(inputVal.getText());
        } catch (NumberFormatException ecc) {
            inputVal.setText("errore");
            return;
        }
        cb.versamento(val);
        fc.updateView();
    }
}
