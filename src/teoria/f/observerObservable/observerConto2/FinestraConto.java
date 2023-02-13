package teoria.f.observerObservable.observerConto2;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

class FinestraConto extends JFrame implements Observer {
    private JLabel display;

    public FinestraConto() {
        super("Conto Corrente");
        display = new JLabel();
        display.setText("Saldo = ");
        add(display);
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
