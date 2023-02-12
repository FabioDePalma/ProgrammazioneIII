package teoria.e.GUIOld.h.multiCastTest;

import javax.swing.*;

/**
 * A frame with buttons to make and close secondary frames
 */
class MainWindow extends JFrame {

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    public MainWindow() {
        setTitle("Cruscotto");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // add panel to frame
        MulticastPanel panel = new MulticastPanel();
        add(panel);
    }
}
