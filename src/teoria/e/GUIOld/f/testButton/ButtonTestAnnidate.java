package teoria.e.GUIOld.f.testButton; /**
 * @version 1.32 2004-05-04
 * @author Cay Horstmann
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTestAnnidate {
    public static void main(String[] args) {
        ButtonFrame2 frame = new ButtonFrame2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/**
 A frame with a button panel
 */
class ButtonFrame2 extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame2() {
        setTitle("ButtonTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // add panel to frame
        ButtonPanel2 panel = new ButtonPanel2();
        add(panel);
    }
}

/**
 A panel with three buttons.
 */
class ButtonPanel2 extends JPanel {

    /**
     An action listener that sets the panel's background color.
     */
    private class ColorAction implements ActionListener {
        private Color backgroundColor;

        public ColorAction(Color c) {
            backgroundColor = c;
        }

        public void actionPerformed(ActionEvent event) {
            setBackground(backgroundColor); // NB: la classe interna vede i metodi della contenitrice e li invoca direttamente
            // setBackground() è un metodo di JComponent (ereditato da JPanel)
        }
    }

    public ButtonPanel2() {
        // create buttons
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        // add buttons to panel
        add(yellowButton);
        add(blueButton);
        add(redButton);

        // create button actions
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        // associate actions with buttons
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }

} // end ButtonPanel



