package teoria.f.observerObservable.observerConto1;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

class FinestraConto extends JFrame implements Observer {
    private JTextArea display;
    private JScrollPane scrollPane;

    public FinestraConto() {
        super("Conto Corrente");
        display = new JTextArea(8, 20);
        scrollPane = new JScrollPane(display);
        add(scrollPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setVisible(true);
    }

    public void update(Observable ob, Object extra_arg) {
        if (ob != null && ob instanceof ContoBancario) {
            ContoBancario cb = (ContoBancario) ob;
            display.append("Conto " + cb.getNumero() + ":   " + cb.getSaldo() + "\n");
        }
    }
}
