package teoria.e.GUIOld.f.testButton.buttonTest1;


import javax.swing.*;

/**
 * A frame with a button panel
 */
class ButtonFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame() {
        setTitle("ButtonTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // add panel to frame
        ButtonPanel panel = new ButtonPanel();
        add(panel);
    }
}
