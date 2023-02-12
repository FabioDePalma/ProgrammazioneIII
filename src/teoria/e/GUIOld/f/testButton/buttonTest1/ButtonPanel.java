package teoria.e.GUIOld.f.testButton.buttonTest1;



import javax.swing.*;
import java.awt.*;

/**
 * A panel with three buttons.
 */
class ButtonPanel extends JPanel {

    public ButtonPanel() {
        // create buttons
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        // add buttons to panel
        add(yellowButton);
        add(blueButton);
        add(redButton);

        // create button actions
        ColorAction yellowAction = new ColorAction(Color.YELLOW, this);
        ColorAction blueAction = new ColorAction(Color.BLUE, this);
        ColorAction redAction = new ColorAction(Color.RED, this);

        // associate actions with buttons
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }
}// end ButtonPanel
