package teoria.e.GUIOld.k.IOTest.menuTest1;

import javax.swing.*;

class MenuFrame extends JFrame {

    public MenuFrame(String name) {
        JMenuBar bar = new JMenuBar();
        add(bar, "North");
        JMenu operazione = new JMenu(name);
        bar.add(operazione);
        operazione.add(new MyJMenuItem("somma"));
        operazione.add(new MyJMenuItem("prodotto"));
        operazione.add(new MyJMenuItem("sottrazione"));
    }

}
