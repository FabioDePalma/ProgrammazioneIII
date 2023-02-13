package teoria.g.MVC.observerContoMVCconObser.view;

import teoria.g.MVC.observerContoMVCconObser.model.ContoBancario;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class FinestraConto extends JFrame implements Observer {
    private JLabel display;
    private JPanel panelConto;

    public FinestraConto() {
        super("Conto Corrente");
        panelConto = new JPanel();
        add(panelConto);
        display = new JLabel();
        display.setText("Saldo: ");
        panelConto.add(display);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 100);
        setVisible(true);
    }

    public void update(Observable ob, Object extra_arg) {
        if (ob != null && ob instanceof ContoBancario) {
            display.setText("Saldo = " + ((ContoBancario) ob).getSaldo());
        }
    }
}
