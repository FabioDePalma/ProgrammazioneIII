package teoria.g.MVC.observerContoMVCsenzaObser.view;

import teoria.g.MVC.observerContoMVCsenzaObser.controller.Controller;

import javax.swing.*;

public class GestisciOperazioni extends JFrame { // seconda view
    private JButton button;
    private JTextField inputVal;
    private JPanel panel;

    public GestisciOperazioni() {
        super("GestisciOperazioni");
        panel = new JPanel();
        add(panel);

        button = new JButton("Versa");
        panel.add(button);
        inputVal = new JTextField("0", 8);
        panel.add(inputVal);

        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);

    }

    public JTextField getInputVal() {
        return inputVal;
    }

    public void setController(Controller c) {
        button.addActionListener(c); // aggancia il listener del controller al bottone
    }
}
