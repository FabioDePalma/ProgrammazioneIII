package teoria.e.GUIOld.a.finestra;

import javax.swing.*;



public class FinestraApp1 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Ciao!");

		// se aggiungo componenti direttamente al pannello, senza layout manager,
		// non vengono ben visualizzati:
        JLabel label1 = new JLabel("Hello World");
        frame.add(label1);

        JLabel label2 = new JLabel("Hello W");
        frame.add(label2);
        /*
        Si vede solo Hello W perchè se non gli si da un layout al frame (vale anche per javaFX)
        ne hanno uno di default, in particolare il JFrame hanno il layout a pila
        quindi ogni nuovo componente va a sovrapporsi al precedente
         */

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
