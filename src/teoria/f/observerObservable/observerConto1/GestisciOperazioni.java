package teoria.f.observerObservable.observerConto1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GestisciOperazioni extends JFrame implements ActionListener {
    private JButton button;
    private JTextField inputVal;
    private JPanel panel;
    private ContoBancario cb;

    public GestisciOperazioni(ContoBancario conto) {
        cb = conto;
        setTitle("Conto " + conto.getNumero());
        panel = new JPanel();
        add(panel);

        button = new JButton("Versa");
        panel.add(button);
        button.addActionListener(this);

        inputVal = new JTextField("0", 8);
        panel.add(inputVal);

        setLocation(conto.getNumero() * 400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int val = Integer.parseInt(inputVal.getText());
        cb.versamento(val);
    }
}
