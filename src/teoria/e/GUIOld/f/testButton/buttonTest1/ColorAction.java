package teoria.e.GUIOld.f.testButton.buttonTest1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorAction implements ActionListener {
    private Color backgroundColor;
    private ButtonPanel bp;

    public ColorAction(Color c, ButtonPanel p) {
        backgroundColor = c;
        bp = p;
    }

    public void actionPerformed(ActionEvent event) {
        bp.setBackground(backgroundColor);
    }
}
