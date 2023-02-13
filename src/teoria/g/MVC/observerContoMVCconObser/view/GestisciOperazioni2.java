package teoria.g.MVC.observerContoMVCconObser.view;

import teoria.g.MVC.observerContoMVCconObser.controller.Controller;

import javax.swing.*;
import java.awt.*;

// seconda versione della GUI
public class GestisciOperazioni2 extends JFrame implements IGestisci { // seconda view
    private JButton button;
    private JTextField inputVal;
    private JPanel panel;

    public GestisciOperazioni2() {
        super("GestisciOperazioni");
        panel = new JPanel();
        panel.setBackground(Color.YELLOW);
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
