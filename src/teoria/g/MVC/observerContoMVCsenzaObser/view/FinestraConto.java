package teoria.g.MVC.observerContoMVCsenzaObser.view;

import teoria.g.MVC.observerContoMVCsenzaObser.model.ContoBancario;

import javax.swing.*;
import java.awt.*;

public class FinestraConto extends JFrame { // prima view
    private JLabel display;
    private JPanel panelConto;
    private ContoBancario cc;

    public FinestraConto(ContoBancario c) {
        super("Conto Corrente");
        cc = c;
        panelConto = new JPanel();
        panelConto.setBackground(Color.WHITE);
        add(panelConto);
        display = new JLabel();
        display.setText("Saldo: ");
        panelConto.add(display);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 100);
        setVisible(true);
    }

    public void updateView() {
        display.setText("Saldo = " + cc.getSaldo());
    }
}
