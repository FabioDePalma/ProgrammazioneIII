package teoria.e.GUIOld.h.multiCastTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A panel with buttons to create and close sample frames.
 */
class MulticastPanel extends JPanel {
    public MulticastPanel() {
        // add "New" button
        JButton newButton = new JButton("New");
        add(newButton);
        final JButton closeAllButton = new JButton("Close all");
        add(closeAllButton);

        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                BlankFrame frame = new BlankFrame(closeAllButton);
                frame.setVisible(true);
            }
        });
    }
}
