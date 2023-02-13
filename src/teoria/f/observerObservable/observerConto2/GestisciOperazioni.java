package teoria.f.observerObservable.observerConto2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GestisciOperazioni extends JFrame {
    private JButton button;
    private JTextField inputVal;
    private JPanel panel;
    private ContoBancario cb;

    public GestisciOperazioni(ContoBancario conto) {
        super("GestisciOperazioni");
        cb = conto;
        panel = new JPanel();
        add(panel);

        button = new JButton("Versa");
        panel.add(button);
        button.addActionListener( e -> {
            int val = Integer.parseInt(inputVal.getText());
            cb.versamento(val);
        });
        inputVal = new JTextField("0", 8);
        panel.add(inputVal);

        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);

    }
}
