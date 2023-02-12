package teoria.e.GUIOld.f.testButton.buttonTest3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A panel with three buttons.
 */
class ButtonPanel extends JPanel implements ActionListener {
    public ButtonPanel() {
        // create buttons
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        // add buttons to panel
        add(yellowButton);
        add(blueButton);
        add(redButton);

        // associate actions with buttons (il panel stesso funge da action listener (this))
        yellowButton.addActionListener(this);
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
    }


    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand(); // restituisce la label del bottone sorgente dell'evento
        if (command.equals("Yellow")) setBackground(Color.YELLOW);
        else if (command.equals("Blue")) setBackground(Color.BLUE);
        else if (command.equals("Red")) setBackground(Color.RED);
    }
}
