package teoria.e.GUIOld.i.jOptionPaneTest.JOptionPaneTest2;

import javax.swing.*;
import java.awt.*;

class MenuFrame extends JFrame {

    private JTextArea risultato;


    public MenuFrame(String name) {
        String dato = JOptionPane.showInputDialog("Inserisci il numero da raddoppiare:");
        risultato = new JTextArea("Risultato: ");
        risultato.setBackground(Color.YELLOW);
        risultato.setForeground(Color.BLACK);
        add(risultato);

        int val = 0;
        try {
            val = Integer.parseInt(dato);
        } catch (Exception ecc) {
            System.out.println(ecc.getMessage());
        }
        val = 2 * val;
        risultato.setText(String.valueOf(val));
        System.out.println(dato + "*2 = " + risultato.getText());

    }

}
