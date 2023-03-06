package teoria.l.gestioneEventiSwing;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EventListener;

/**
 * A panel that counts how often it is painted.
 */
class PaintCountPanel extends JPanel {

    private int paintCount;

    public void paintComponent(Graphics g) {
        int oldPaintCount = paintCount;
        paintCount++;
        firePropertyChangeEvent(new PropertyChangeEvent(this, "paintCount", oldPaintCount, paintCount));
        super.paintComponent(g);
    }

    /**
     * Adds a change listener
     *
     * @param listener the listener to add
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listenerList.add(PropertyChangeListener.class, listener);
    }

    /**
     * Removes a change listener
     *
     * @param listener the listener to remove
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listenerList.remove(PropertyChangeListener.class, listener);
    }

    public void firePropertyChangeEvent(PropertyChangeEvent event) {
        EventListener[] listeners = listenerList.getListeners(PropertyChangeListener.class);
        for (EventListener l : listeners)
            ((PropertyChangeListener) l).propertyChange(event);
    }

/*
   public int getPaintCount() {
      return paintCount;
   }
*/
}
