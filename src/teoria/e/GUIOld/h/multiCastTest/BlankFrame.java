package teoria.e.GUIOld.h.multiCastTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A blank frame that can be closed by clicking a button.
 */
class BlankFrame extends JFrame {
    /**
     * Constructs a blank frame
     *
     * @param closeButton the button to close this frame
     */

    private ActionListener closeListener;
    public static final int DEFAULT_WIDTH = 200;
    public static final int DEFAULT_HEIGHT = 150;
    public static final int SPACING = 40;
    private static int counter = 0;

    public BlankFrame(final JButton closeButton) {
        counter++;
        setTitle("Frame " + counter);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocation(SPACING * counter, 160 + SPACING * counter);

        closeListener = event -> {
            closeButton.removeActionListener(closeListener); // rimuove l'action listener che non serve piu'
            dispose(); // chiude la finestra
        };
        closeButton.addActionListener(closeListener);
    }

}
