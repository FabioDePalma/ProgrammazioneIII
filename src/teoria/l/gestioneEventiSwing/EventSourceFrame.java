package teoria.l.gestioneEventiSwing;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * A frame that contains a panel with drawings
 */
class EventSourceFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 200;

    public EventSourceFrame() {
        setTitle("EventSourceTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // add panel to frame
        final PaintCountPanel panel = new PaintCountPanel();
        add(panel);

        panel.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent event) {
                setTitle("EventSourceTest - " + event.getNewValue());
            }
        });
    }

}
