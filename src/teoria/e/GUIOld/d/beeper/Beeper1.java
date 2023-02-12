package teoria.e.GUIOld.d.beeper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Beeper1 extends JFrame {
    private JPanel panel;
    private JButton button;

    private Beeper1() {
        super("Test listener");
        panel = new JPanel();
        add(panel);
        button = new JButton("Click Me");
        panel.add(button);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new BeepListener());
        /*
        Se commentassimo button.addActionListener(new BeepListener()); (la riga sopra)
        non farebbe biip perché al bottone dobbiamo metterci un listener, ovvero un gestore dell'evento.
        GESTORE DELL'EVENTO!!!!!!  il gestore dell'evento(event hangler) è l'actionListener
         */
        setVisible(true);
    }

    public static void main(String[] args) {
        Beeper1 beep = new Beeper1();
    }

    // BeepListener è innestata per
    // nascondere i tipi che non servono al di fuori della classe principale
    // siccome non utilizza lo stato di Beeper1, la definisco static
    private static class BeepListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Toolkit.getDefaultToolkit().beep();
            System.out.println("BEEEEPPPP!!!!!");
            System.out.println("Il command del bottone è: " + e.getActionCommand());
        }
    }
}
