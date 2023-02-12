package teoria.e.GUIOld.f.testButton.buttonTest4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                setBackground(Color.YELLOW);
            }
        });
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                setBackground(Color.BLUE);
            }
        });

        redButton.addActionListener(event -> setBackground(Color.RED));
    }


}
