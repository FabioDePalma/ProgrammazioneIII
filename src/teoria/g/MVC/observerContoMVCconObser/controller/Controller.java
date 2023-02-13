package teoria.g.MVC.observerContoMVCconObser.controller;

import teoria.g.MVC.observerContoMVCconObser.view.IGestisci;
import teoria.g.MVC.observerContoMVCconObser.model.ContoBancario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private ContoBancario cb;
    private IGestisci go;
    private JTextField inputVal;

    public Controller(ContoBancario conto, IGestisci view) {
        cb = conto;
        go = view;
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
    }
}
