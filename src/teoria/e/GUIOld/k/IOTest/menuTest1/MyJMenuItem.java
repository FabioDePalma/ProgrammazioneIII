package teoria.e.GUIOld.k.IOTest.menuTest1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJMenuItem extends JMenuItem {

    public MyJMenuItem(String label) {
        super(label);
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selected: " + e.getActionCommand());
            }
        });
    }
}
